package can.siempredelao.f1kotlin

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import androidx.core.widget.toast
import can.siempredelao.f1kotlin.backend.Backend
import dagger.android.DaggerActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerActivity() {

    @Inject
    lateinit var backend: Backend
    @Inject
    lateinit var errorParser: ErrorParser

    private val compositeDisposable = CompositeDisposable()

    private lateinit var racesAdapter: RacesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        with(rvRaces) {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            racesAdapter = RacesAdapter(object : RacesAdapter.OnRaceItemClickListener {
                override fun onRaceClick(season: String, round: String) {
                    startActivity(RaceDetailsActivity.openRaceDetailsIntent(season, round, this@MainActivity))
                }
            })
            adapter = racesAdapter
        }

        backend.getRacesBySeason("2018")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map { it.mrData.raceTable.races }
                .subscribe({ racesAdapter.addItem(it) }, { toast(errorParser.parse(it)) })
                .toBeDisposed()
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.dispose()
    }

    fun Disposable.toBeDisposed() {
        compositeDisposable.add(this)
    }
}

