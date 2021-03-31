package can.siempredelao.f1kotlin.backend.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u000e"}, d2 = {"Lcan/siempredelao/f1kotlin/backend/model/StandingsList;", "", "season", "", "round", "driverStandings", "", "Lcan/siempredelao/f1kotlin/backend/model/DriverStanding;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDriverStandings", "()Ljava/util/List;", "getRound", "()Ljava/lang/String;", "getSeason", "app_debug"})
public final class StandingsList {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String season = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String round = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "DriverStandings")
    private final java.util.List<can.siempredelao.f1kotlin.backend.model.DriverStanding> driverStandings = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSeason() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRound() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<can.siempredelao.f1kotlin.backend.model.DriverStanding> getDriverStandings() {
        return null;
    }
    
    public StandingsList(@org.jetbrains.annotations.NotNull()
    java.lang.String season, @org.jetbrains.annotations.NotNull()
    java.lang.String round, @org.jetbrains.annotations.NotNull()
    java.util.List<can.siempredelao.f1kotlin.backend.model.DriverStanding> driverStandings) {
        super();
    }
}