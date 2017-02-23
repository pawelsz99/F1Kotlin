package can.siempredelao.f1kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.View
import android.widget.AdapterView
import can.siempredelao.f1kotlin.backend.Backend
import can.siempredelao.f1kotlin.dagger.BackendModule
import can.siempredelao.f1kotlin.dagger.DaggerAppComponent
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import rx.subscriptions.CompositeSubscription
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var backend: Backend

    val compositeSubscription = CompositeSubscription()

    lateinit var racesAdapter: RacesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAppComponent.builder().backendModule(BackendModule()).build().inject(this)

        with(rvRaces) {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            racesAdapter = RacesAdapter(object : RacesAdapter.OnRaceItemClickListener {
                override fun onRaceClick(season: String, round: String) {
                    // TODO open race details
                    toast("Risas y fiestas")
                }
            })
            adapter = racesAdapter
        }

        val subscription = backend.getRacesBySeason("2017")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap({ Observable.from(it.mrData.raceTable.races) })
                .subscribe({ race ->
                               racesAdapter.addItem(race)
                           },
                           { throwable -> Log.i("MainActivity", "onError " + throwable.message) })

        compositeSubscription.add(subscription)
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeSubscription.unsubscribe()
    }
}

