package can.siempredelao.f1kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import can.siempredelao.f1kotlin.backend.Backend
import can.siempredelao.f1kotlin.dagger.BackendModule
import can.siempredelao.f1kotlin.dagger.DaggerAppComponent
import org.jetbrains.anko.find
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import rx.subscriptions.CompositeSubscription
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var backend: Backend

    val compositeSubscription = CompositeSubscription()

    val textView11 by lazy { find<TextView>(R.id.textview) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAppComponent.builder().backendModule(BackendModule()).build().inject(this)

        val subscription = backend.getSeasonByYear("2017")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap({ Observable.from(it.mrData.raceTable.races) })
                .subscribe({ race ->
                               textView11.text = textView11.text.toString().plus(race.circuit.circuitName).plus("\n\n")
                           },
                           { throwable -> Log.i("MainActivity", "onError " + throwable.message) })

        compositeSubscription.add(subscription)
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeSubscription.unsubscribe()
    }
}
