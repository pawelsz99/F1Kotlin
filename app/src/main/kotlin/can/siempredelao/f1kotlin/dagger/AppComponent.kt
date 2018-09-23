package can.siempredelao.f1kotlin.dagger

import can.siempredelao.f1kotlin.F1Application
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

/**
 * Created by david on 11.02.17.
 */
@Singleton
@Component(modules = [AppModule::class, BackendModule::class, AndroidInjectionModule::class, ActivityInjectorModule::class])
interface AppComponent : AndroidInjector<F1Application> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<F1Application>()

}