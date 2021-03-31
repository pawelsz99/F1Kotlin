package can.siempredelao.f1kotlin.backend;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0006H\'J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0006H\'J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0006H\'J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0006H\'J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0006H\'J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0006H\'J,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u001bH\'J\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\b\b\u0001\u0010\u000b\u001a\u00020\u0006H\'\u00a8\u0006\u001d"}, d2 = {"Lcan/siempredelao/f1kotlin/backend/Backend;", "", "getDriverChampionships", "Lio/reactivex/Observable;", "Lcan/siempredelao/f1kotlin/backend/model/StandingsResponse;", "driverId", "", "getDriverInfo", "Lcan/siempredelao/f1kotlin/backend/model/DriverResponse;", "getDriverPolesBySeason", "Lcan/siempredelao/f1kotlin/backend/model/RaceResponse;", "season", "getDriverPolesOverall", "getDriverVictoriesBySeason", "getDriverVictoriesOverall", "getFullRaceResults", "round", "getManufacturerInfo", "Lcan/siempredelao/f1kotlin/backend/model/ManufacturerResponse;", "constructorId", "getManufacturerVictoriesOverall", "getRaceFastestLap", "getRaceInfo", "Lio/reactivex/Single;", "getRacePole", "getRaceResultsByPosition", "position", "", "getRacesBySeason", "app_debug"})
public abstract interface Backend {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "{season}")
    public abstract io.reactivex.Single<can.siempredelao.f1kotlin.backend.model.RaceResponse> getRacesBySeason(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "season")
    java.lang.String season);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "{season}/{round}")
    public abstract io.reactivex.Single<can.siempredelao.f1kotlin.backend.model.RaceResponse> getRaceInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "season")
    java.lang.String season, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "round")
    java.lang.String round);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "{season}/{round}/results")
    public abstract io.reactivex.Observable<can.siempredelao.f1kotlin.backend.model.RaceResponse> getFullRaceResults(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "season")
    java.lang.String season, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "round")
    java.lang.String round);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "{season}/{round}/results/{position}")
    public abstract io.reactivex.Single<can.siempredelao.f1kotlin.backend.model.RaceResponse> getRaceResultsByPosition(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "season")
    java.lang.String season, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "round")
    java.lang.String round, @retrofit2.http.Path(value = "position")
    int position);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "{season}/{round}/grid/1/qualifying")
    public abstract io.reactivex.Single<can.siempredelao.f1kotlin.backend.model.RaceResponse> getRacePole(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "season")
    java.lang.String season, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "round")
    java.lang.String round);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "{season}/{round}/fastest/1/results")
    public abstract io.reactivex.Observable<can.siempredelao.f1kotlin.backend.model.RaceResponse> getRaceFastestLap(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "season")
    java.lang.String season, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "round")
    java.lang.String round);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "drivers/{driverId}")
    public abstract io.reactivex.Observable<can.siempredelao.f1kotlin.backend.model.DriverResponse> getDriverInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "driverId")
    java.lang.String driverId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "drivers/{driverId}/results/1")
    public abstract io.reactivex.Observable<can.siempredelao.f1kotlin.backend.model.RaceResponse> getDriverVictoriesOverall(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "driverId")
    java.lang.String driverId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "{season}/drivers/{driverId}/results/1")
    public abstract io.reactivex.Observable<can.siempredelao.f1kotlin.backend.model.RaceResponse> getDriverVictoriesBySeason(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "season")
    java.lang.String season, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "driverId")
    java.lang.String driverId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "drivers/{driverId}/grid/1/results")
    public abstract io.reactivex.Observable<can.siempredelao.f1kotlin.backend.model.RaceResponse> getDriverPolesOverall(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "driverId")
    java.lang.String driverId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "{season}/drivers/{driverId}/grid/1/results")
    public abstract io.reactivex.Observable<can.siempredelao.f1kotlin.backend.model.RaceResponse> getDriverPolesBySeason(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "season")
    java.lang.String season, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "driverId")
    java.lang.String driverId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "drivers/{driverId}/driverStandings/1")
    public abstract io.reactivex.Observable<can.siempredelao.f1kotlin.backend.model.StandingsResponse> getDriverChampionships(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "driverId")
    java.lang.String driverId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "constructors/{constructorId}")
    public abstract io.reactivex.Observable<can.siempredelao.f1kotlin.backend.model.ManufacturerResponse> getManufacturerInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "constructorId")
    java.lang.String constructorId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "constructors/{constructorId}/results/1")
    public abstract io.reactivex.Observable<can.siempredelao.f1kotlin.backend.model.RaceResponse> getManufacturerVictoriesOverall(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "constructorId")
    java.lang.String constructorId);
}