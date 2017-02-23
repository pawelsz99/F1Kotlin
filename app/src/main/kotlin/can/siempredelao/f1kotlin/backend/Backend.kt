package can.siempredelao.f1kotlin.backend

import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable

/**
 * Created by david on 10.02.17.
 */
interface Backend {

    @GET("{season}.json")
    fun getRacesBySeason(@Path("season") season: String): Observable<RaceResponse>

    @GET("{season}/{round}.json")
    fun getRaceInfo(@Path("season") season: String, @Path("round") round: String): Observable<RaceResponse>

    @GET("{season}/{round}/results.json")
    fun getFullRaceResults(@Path("season") season: String,
                           @Path("round") round: String): Observable<RaceResponse>

    // { 1 -> Winner, 2 -> Second, 3 -> Third } in podium
    @GET("{season}/{round}/results/{position}.json")
    fun getRaceResultsByPosition(@Path("season") season: String,
                                 @Path("round") round: String): Observable<RaceResponse>

    @GET("{season}/{round}/grid/1/qualifying.json")
    fun getRacePole(@Path("season") season: String, @Path("round") round: String): Observable<RaceResponse>

    @GET("{season}/{round}/fastest/1/results.json")
    fun getRaceFastestLap(@Path("season") season: String, @Path("round") round: String): Observable<RaceResponse>


    @GET("drivers/{driverId}.json")
    fun getDriverInfo(@Path("driverId") driverId: String): Observable<DriverResponse>

    @GET("drivers/{driverId}/results/1.json")
    fun getDriverVictoriesOverall(@Path("driverId") driverId: String): Observable<RaceResponse>

    @GET("{season}/drivers/{driverId}/results/1.json")
    fun getDriverVictoriesBySeason(@Path("season") season: String,
                                   @Path("driverId") driverId: String): Observable<RaceResponse>

    @GET("drivers/{driverId}/grid/1/results.json")
    fun getDriverPolesOverall(@Path("driverId") driverId: String): Observable<RaceResponse>

    @GET("{season}/drivers/{driverId}/grid/1/results.json")
    fun getDriverPolesBySeason(@Path("season") season: String,
                               @Path("driverId") driverId: String): Observable<RaceResponse>

    @GET("drivers/{driverId}/driverStandings/1.json")
    fun getDriverChampionships(@Path("driverId") driverId: String): Observable<StandingsResponse>


    @GET("constructors/{constructorId}.json")
    fun getManufacturerInfo(@Path("constructorId") constructorId: String): Observable<ManufacturerResponse>

    @GET("constructors/{constructorId}/results/1.json")
    fun getManufacturerVictoriesOverall(@Path("constructorId") constructorId: String): Observable<RaceResponse>


    // many more, add on demand...

}