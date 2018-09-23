package can.siempredelao.f1kotlin

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.core.os.bundleOf
import androidx.core.widget.toast
import can.siempredelao.f1kotlin.backend.Backend
import can.siempredelao.f1kotlin.backend.model.Driver
import can.siempredelao.f1kotlin.backend.model.Race
import can.siempredelao.f1kotlin.backend.model.Result
import can.siempredelao.f1kotlin.data.Clock
import dagger.android.DaggerActivity
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Function3
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_racedetails.*
import org.joda.time.LocalDate
import javax.inject.Inject

class RaceDetailsActivity : DaggerActivity() {

    companion object {

        private const val SEASON_EXTRA_KEY = "season_extra"
        private const val ROUND_EXTRA_KEY = "round_extra"

        fun openRaceDetailsIntent(season: String, round: String, context: Context) =
                Intent(context, RaceDetailsActivity::class.java).apply {
                    val bundle = bundleOf(SEASON_EXTRA_KEY to season, ROUND_EXTRA_KEY to round)
                    putExtras(bundle)
                }
    }

    @Inject
    lateinit var backend: Backend
    @Inject
    lateinit var clock: Clock

    private val compositeDisposable = CompositeDisposable()

    private lateinit var season: String
    private lateinit var round: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_racedetails)

        checkNotNull(intent.extras)
        season = intent.getStringExtra(SEASON_EXTRA_KEY)
        round = intent.getStringExtra(ROUND_EXTRA_KEY)

        backend.getRaceInfo(season, round)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map { it.mrData.raceTable.races }
                .filter { it.isNotEmpty() }
                .map { it[0] }
                .doOnSuccess {
                    if (LocalDate(clock.now()).isAfter(LocalDate(it.date))) {
                        fetchPoleman()
                        fetchPodium()
                        fetchFastestLap()
                    } else {
                        toast("Not raced yet!")
                    }
                }
                .subscribe(this::showRace, this::showError)
                .toBeDisposed()
    }

    private fun showRace(race: Race) {
        tvRace.text = race.raceName
        tvCircuit.text = race.circuit.circuitName
        tvDatetime.text = race.date.plus(" @ ").plus(race.time)
        tvRound.text = race.round
        tvGeoInfo.text = race.circuit.location.lat.plus(", ").plus(race.circuit.location._long)
        tvGeoInfo.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW,
                                 Uri.parse(String.format("geo:%s,%s",
                                                         race.circuit.location.lat,
                                                         race.circuit.location._long))))
        }
        tvPlace.text = race.circuit.location.locality.plus(", ").plus(race.circuit.location.country)
    }

    private fun showError(throwable: Throwable) {
        Log.i("RaceDetailsActivity", "onError " + throwable.message)
    }

    private fun fetchPoleman() {
        backend.getRacePole(season, round)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map { it.mrData.raceTable.races[0].qualifyingResults[0].driver }
                .subscribe(this::showPoleman, this::showError)
                .toBeDisposed()
    }

    fun showPoleman(driver: Driver) {
        tvPole.text = "Poleman: ${driver.givenName} ${driver.familyName}"
    }

    private fun fetchPodium() {
        Single.zip(backend.getRaceResultsByPosition(season, round, 1)
                           .map { it.mrData.raceTable.races[0].results[0] },
                   backend.getRaceResultsByPosition(season, round, 2)
                           .map { it.mrData.raceTable.races[0].results[0] },
                   backend.getRaceResultsByPosition(season, round, 3)
                           .map { it.mrData.raceTable.races[0].results[0] },
                   Function3(this::packPodiumToList))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::showResults, this::showError)
                .toBeDisposed()
    }

    private fun packPodiumToList(r1: Result, r2: Result, r3: Result) = listOf(r1, r2, r3)

    private fun showResults(podiumList: List<Result>) {
        tvFirstClassified.text = podiumList[0].driver.familyName
        tvSecondClassified.text = podiumList[1].driver.familyName
        tvThirdClassified.text = podiumList[2].driver.familyName
    }

    private fun fetchFastestLap() {
        backend.getRaceFastestLap(season, round)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map { it.mrData.raceTable.races[0].results[0] }
                .subscribe(this::showFastestLap, this::showError)
                .toBeDisposed()
    }

    private fun showFastestLap(result: Result) {
        tvFastestLap.text = "Fastest lap: ${result.fastestLap.time.time} by ${result.driver.familyName}"
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.dispose()
    }

    fun Disposable.toBeDisposed() {
        compositeDisposable.add(this)
    }
}
