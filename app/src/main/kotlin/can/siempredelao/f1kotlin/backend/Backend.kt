package can.siempredelao.f1kotlin.backend

import can.siempredelao.f1kotlin.backend.model.DriverResponse
import can.siempredelao.f1kotlin.backend.model.ManufacturerResponse
import can.siempredelao.f1kotlin.backend.model.RaceResponse
import can.siempredelao.f1kotlin.backend.model.StandingsResponse
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface Backend {

    @GET("{season}")
    fun getRacesBySeason(@Path("season") season: String): Single<RaceResponse>

    @GET("{season}/{round}")
    fun getRaceInfo(@Path("season") season: String, @Path("round") round: String): Single<RaceResponse>

    @GET("{season}/{round}/results")
    fun getFullRaceResults(@Path("season") season: String,
                           @Path("round") round: String): Observable<RaceResponse>

    // { 1 -> Winner, 2 -> Second, 3 -> Third } in podium
    @GET("{season}/{round}/results/{position}")
    fun getRaceResultsByPosition(@Path("season") season: String,
                                 @Path("round") round: String): Observable<RaceResponse>

    @GET("{season}/{round}/grid/1/qualifying")
    fun getRacePole(@Path("season") season: String, @Path("round") round: String): Observable<RaceResponse>

    @GET("{season}/{round}/fastest/1/results")
    fun getRaceFastestLap(@Path("season") season: String, @Path("round") round: String): Observable<RaceResponse>


    @GET("drivers/{driverId}")
    fun getDriverInfo(@Path("driverId") driverId: String): Observable<DriverResponse>

    @GET("drivers/{driverId}/results/1")
    fun getDriverVictoriesOverall(@Path("driverId") driverId: String): Observable<RaceResponse>

    @GET("{season}/drivers/{driverId}/results/1")
    fun getDriverVictoriesBySeason(@Path("season") season: String,
                                   @Path("driverId") driverId: String): Observable<RaceResponse>

    @GET("drivers/{driverId}/grid/1/results")
    fun getDriverPolesOverall(@Path("driverId") driverId: String): Observable<RaceResponse>

    @GET("{season}/drivers/{driverId}/grid/1/results")
    fun getDriverPolesBySeason(@Path("season") season: String,
                               @Path("driverId") driverId: String): Observable<RaceResponse>

    @GET("drivers/{driverId}/driverStandings/1")
    fun getDriverChampionships(@Path("driverId") driverId: String): Observable<StandingsResponse>


    @GET("constructors/{constructorId}")
    fun getManufacturerInfo(@Path("constructorId") constructorId: String): Observable<ManufacturerResponse>

    @GET("constructors/{constructorId}/results/1")
    fun getManufacturerVictoriesOverall(@Path("constructorId") constructorId: String): Observable<RaceResponse>


    // many more, add on demand...

}