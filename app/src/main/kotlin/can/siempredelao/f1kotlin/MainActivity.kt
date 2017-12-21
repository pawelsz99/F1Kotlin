package can.siempredelao.f1kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import can.siempredelao.f1kotlin.backend.Backend
import can.siempredelao.f1kotlin.dagger.BackendModule
import can.siempredelao.f1kotlin.dagger.DaggerAppComponent
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var backend: Backend

    private val compositeDisposable = CompositeDisposable()

    private lateinit var racesAdapter: RacesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAppComponent.builder().backendModule(BackendModule()).build().inject(this)

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

        backend.getRacesBySeason("2017")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map { it.mrData.raceTable.races }
                .filter({ it.isNotEmpty() })
                .subscribe({ races ->
                               racesAdapter.addItem(races)
                           },
                           { throwable -> Log.i("MainActivity", "onError " + throwable.message) })
                .let { compositeDisposable.add(it) }
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.dispose()
    }
}

