package can.siempredelao.f1kotlin.dagger

import can.siempredelao.f1kotlin.MainActivity
import can.siempredelao.f1kotlin.RaceDetailsActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by david on 23.09.18.
 */
@Module
abstract class ActivityInjectorModule {

    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun raceDetailsActivity(): RaceDetailsActivity
}