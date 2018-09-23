package can.siempredelao.f1kotlin.dagger

import android.content.Context
import can.siempredelao.f1kotlin.DefaultErrorParser
import can.siempredelao.f1kotlin.ErrorParser
import can.siempredelao.f1kotlin.F1Application
import can.siempredelao.f1kotlin.data.Clock
import can.siempredelao.f1kotlin.data.ProductionClock
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    fun provideContext(application: F1Application): Context = application.applicationContext

    @Provides
    @Singleton
    fun provideErrorParser(context: Context): ErrorParser = DefaultErrorParser(context)

    @Provides
    @Singleton
    fun provideClock(): Clock = ProductionClock()
}
