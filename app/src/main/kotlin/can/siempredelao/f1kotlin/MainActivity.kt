package can.siempredelao.f1kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import can.siempredelao.f1kotlin.backend.Backend
import can.siempredelao.f1kotlin.dagger.AppModule
import can.siempredelao.f1kotlin.dagger.BackendModule
import can.siempredelao.f1kotlin.dagger.DaggerAppComponent
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var backend: Backend
    @Inject
    lateinit var errorParser: ErrorParser

    private val compositeDisposable = CompositeDisposable()

    private lateinit var racesAdapter: RacesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAppComponent.builder().appModule(AppModule(applicationContext)).backendModule(BackendModule()).build().inject(this)

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
                .subscribe({ races ->
                               racesAdapter.addItem(races)
                           },
                           {
                               throwable -> toast(errorParser.parse(throwable))
                           })
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

