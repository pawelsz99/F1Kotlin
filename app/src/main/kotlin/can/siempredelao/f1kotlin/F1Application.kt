package can.siempredelao.f1kotlin

import android.app.Activity
import android.app.Application
import can.siempredelao.f1kotlin.dagger.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by david on 23.09.18.
 */
class F1Application : Application(), HasActivityInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder().create(this).inject(this)
    }

    override fun activityInjector() = activityInjector
}
