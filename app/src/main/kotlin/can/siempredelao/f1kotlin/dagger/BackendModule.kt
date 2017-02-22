package can.siempredelao.f1kotlin.dagger

import can.siempredelao.f1kotlin.backend.Backend
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level.BODY
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by david on 10.02.17.
 */
@Module
class BackendModule {

    companion object {
        val ENDPOINT: String = "http://ergast.com/api/f1/" // so far only Formula 1, maybe in future Formula E
    }

    @Provides
    @Singleton
    fun provideBackend(): Backend {
        return retrofit().create(Backend::class.java)
    }

    private fun retrofit(): Retrofit {
        return Retrofit.Builder()
                .client(okHttpClient())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson()))
                .baseUrl(ENDPOINT)
                .build()
    }

    private fun okHttpClient() = OkHttpClient.Builder().addInterceptor(HttpLoggingInterceptor().setLevel(BODY)).build()

    private fun gson() = GsonBuilder().serializeNulls().create()
}
