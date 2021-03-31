package can.siempredelao.f1kotlin.backend.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u0006#"}, d2 = {"Lcan/siempredelao/f1kotlin/backend/model/Result;", "", "number", "", "position", "positionText", "points", "driver", "Lcan/siempredelao/f1kotlin/backend/model/Driver;", "constructor", "Lcan/siempredelao/f1kotlin/backend/model/Constructor;", "grid", "laps", "status", "time", "Lcan/siempredelao/f1kotlin/backend/model/Time;", "fastestLap", "Lcan/siempredelao/f1kotlin/backend/model/FastestLap;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcan/siempredelao/f1kotlin/backend/model/Driver;Lcan/siempredelao/f1kotlin/backend/model/Constructor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcan/siempredelao/f1kotlin/backend/model/Time;Lcan/siempredelao/f1kotlin/backend/model/FastestLap;)V", "getConstructor", "()Lcan/siempredelao/f1kotlin/backend/model/Constructor;", "getDriver", "()Lcan/siempredelao/f1kotlin/backend/model/Driver;", "getFastestLap", "()Lcan/siempredelao/f1kotlin/backend/model/FastestLap;", "getGrid", "()Ljava/lang/String;", "getLaps", "getNumber", "getPoints", "getPosition", "getPositionText", "getStatus", "getTime", "()Lcan/siempredelao/f1kotlin/backend/model/Time;", "app_debug"})
public final class Result {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String number = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String position = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String positionText = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String points = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Driver")
    private final can.siempredelao.f1kotlin.backend.model.Driver driver = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Constructor")
    private final can.siempredelao.f1kotlin.backend.model.Constructor constructor = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String grid = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String laps = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Time")
    private final can.siempredelao.f1kotlin.backend.model.Time time = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "FastestLap")
    private final can.siempredelao.f1kotlin.backend.model.FastestLap fastestLap = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPositionText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPoints() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final can.siempredelao.f1kotlin.backend.model.Driver getDriver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final can.siempredelao.f1kotlin.backend.model.Constructor getConstructor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGrid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLaps() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final can.siempredelao.f1kotlin.backend.model.Time getTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final can.siempredelao.f1kotlin.backend.model.FastestLap getFastestLap() {
        return null;
    }
    
    public Result(@org.jetbrains.annotations.NotNull()
    java.lang.String number, @org.jetbrains.annotations.NotNull()
    java.lang.String position, @org.jetbrains.annotations.NotNull()
    java.lang.String positionText, @org.jetbrains.annotations.NotNull()
    java.lang.String points, @org.jetbrains.annotations.NotNull()
    can.siempredelao.f1kotlin.backend.model.Driver driver, @org.jetbrains.annotations.NotNull()
    can.siempredelao.f1kotlin.backend.model.Constructor constructor, @org.jetbrains.annotations.NotNull()
    java.lang.String grid, @org.jetbrains.annotations.NotNull()
    java.lang.String laps, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    can.siempredelao.f1kotlin.backend.model.Time time, @org.jetbrains.annotations.NotNull()
    can.siempredelao.f1kotlin.backend.model.FastestLap fastestLap) {
        super();
    }
}