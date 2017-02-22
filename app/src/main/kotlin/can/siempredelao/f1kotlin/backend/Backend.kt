package can.siempredelao.f1kotlin.backend

import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable

/**
 * Created by david on 10.02.17.
 */
interface Backend {

    @GET("{year}.json")
    fun getSeasonByYear(@Path("year") year: String): Observable<SeasonResponse>
}