package can.siempredelao.f1kotlin.dagger

import can.siempredelao.f1kotlin.backend.Backend
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level.BODY
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class BackendModule {

    companion object {
        private const val ENDPOINT: String = "http://ergast.com/api/f1/" // so far only Formula 1, maybe in future Formula E
    }

    @Provides
    @Singleton
    fun provideBackend(): Backend {
        return retrofit().create(Backend::class.java)
    }

    private fun retrofit(): Retrofit {
        return Retrofit.Builder()
                .client(okHttpClient())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson()))
                .baseUrl(ENDPOINT)
                .build()
    }

    private fun okHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor().setLevel(BODY))
                .addInterceptor {
                    // Hack to add ".json" to all requests
                    val url = it.request().url()
                    val lastEncodedPathSegment = url.encodedPathSegments()[url.encodedPathSegments().lastIndex]
                    val modifiedLastEncodedPathSegment = "$lastEncodedPathSegment.json"

                    val urlJsonAppended = url.newBuilder()
                            .removePathSegment(url.encodedPathSegments().lastIndex)
                            .addEncodedPathSegments(modifiedLastEncodedPathSegment).build()
                    val requestJsonAppended = it.request().newBuilder().url(urlJsonAppended).build()
                    it.proceed(requestJsonAppended)
                }
                .build()
    }

    private fun gson() = GsonBuilder().serializeNulls().create()
}
