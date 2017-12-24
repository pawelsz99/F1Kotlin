package can.siempredelao.f1kotlin.dagger

import can.siempredelao.f1kotlin.MainActivity
import can.siempredelao.f1kotlin.RaceDetailsActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by david on 11.02.17.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class, BackendModule::class))
interface AppComponent {

    fun inject(activity: MainActivity)
    fun inject(activity: RaceDetailsActivity)
}