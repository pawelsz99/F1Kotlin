package can.siempredelao.f1kotlin.dagger

import android.content.Context
import can.siempredelao.f1kotlin.DefaultErrorParser
import can.siempredelao.f1kotlin.ErrorParser
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val context: Context) {

    @Provides
    fun provideContext(): Context = context.applicationContext

    @Provides
    @Singleton
    fun provideBackend(context: Context): ErrorParser = DefaultErrorParser(context)
}
