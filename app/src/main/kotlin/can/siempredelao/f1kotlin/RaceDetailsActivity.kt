package can.siempredelao.f1kotlin

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import can.siempredelao.f1kotlin.backend.Backend
import can.siempredelao.f1kotlin.dagger.BackendModule
import can.siempredelao.f1kotlin.dagger.DaggerAppComponent
import kotlinx.android.synthetic.main.activity_racedetails.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import rx.subscriptions.CompositeSubscription
import javax.inject.Inject

class RaceDetailsActivity : AppCompatActivity() {

    companion object {
        private val SEASON_EXTRA_KEY = "season_extra"
        private val ROUND_EXTRA_KEY = "round_extra"

        fun openRaceDetailsIntent(season: String, round: String, context: Context): Intent {
            return context.intentFor<RaceDetailsActivity>(SEASON_EXTRA_KEY to season, ROUND_EXTRA_KEY to round)
        }
    }

    @Inject
    lateinit var backend: Backend

    val compositeSubscription = CompositeSubscription()

    lateinit var season: String
    lateinit var round: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_racedetails)

        DaggerAppComponent.builder().backendModule(BackendModule()).build().inject(this)

        if (!intent.extras?.isEmpty!!) {
            season = intent.getStringExtra(SEASON_EXTRA_KEY)
            round = intent.getStringExtra(ROUND_EXTRA_KEY)
        } else {
            toast("Empty extras, close race details")
            finish()
        }


        val subscription = backend.getRaceInfo(season, round)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap({ Observable.from(it.mrData.raceTable.races) })
                .first()
                .subscribe({ race ->
                               tvRace.text = race.raceName
                               tvCircuit.text = race.circuit.circuitName
                               tvDatetime.text = race.date.plus(" @ ").plus(race.time)
                               tvRound.text = race.round
                               tvGeoInfo.text = race.circuit.location.lat.plus(", ").plus(race.circuit.location._long)
                               tvGeoInfo.setOnClickListener { startActivity(Intent(Intent.ACTION_VIEW,
                                                                                   Uri.parse(String.format("geo:%s,%s",
                                                                                                           race.circuit.location.lat,
                                                                                                           race.circuit.location._long))))
                               }
                               tvPlace.text = race.circuit.location.locality.plus(", ").plus(race.circuit.location.country)
                           })

        compositeSubscription.add(subscription)
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeSubscription.unsubscribe()
    }
}
