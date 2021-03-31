package can.siempredelao.f1kotlin.backend.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u00a2\u0006\u0002\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014\u00a8\u0006\u001d"}, d2 = {"Lcan/siempredelao/f1kotlin/backend/model/Race;", "", "season", "", "round", "url", "raceName", "circuit", "Lcan/siempredelao/f1kotlin/backend/model/Circuit;", "date", "time", "results", "", "Lcan/siempredelao/f1kotlin/backend/model/Result;", "qualifyingResults", "Lcan/siempredelao/f1kotlin/backend/model/QualifyingResult;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcan/siempredelao/f1kotlin/backend/model/Circuit;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCircuit", "()Lcan/siempredelao/f1kotlin/backend/model/Circuit;", "getDate", "()Ljava/lang/String;", "getQualifyingResults", "()Ljava/util/List;", "getRaceName", "getResults", "getRound", "getSeason", "getTime", "getUrl", "app_debug"})
public final class Race {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String season = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String round = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String url = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String raceName = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Circuit")
    private final can.siempredelao.f1kotlin.backend.model.Circuit circuit = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String time = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Results")
    private final java.util.List<can.siempredelao.f1kotlin.backend.model.Result> results = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "QualifyingResults")
    private final java.util.List<can.siempredelao.f1kotlin.backend.model.QualifyingResult> qualifyingResults = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSeason() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRound() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRaceName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final can.siempredelao.f1kotlin.backend.model.Circuit getCircuit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<can.siempredelao.f1kotlin.backend.model.Result> getResults() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<can.siempredelao.f1kotlin.backend.model.QualifyingResult> getQualifyingResults() {
        return null;
    }
    
    public Race(@org.jetbrains.annotations.NotNull()
    java.lang.String season, @org.jetbrains.annotations.NotNull()
    java.lang.String round, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String raceName, @org.jetbrains.annotations.NotNull()
    can.siempredelao.f1kotlin.backend.model.Circuit circuit, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String time, @org.jetbrains.annotations.NotNull()
    java.util.List<can.siempredelao.f1kotlin.backend.model.Result> results, @org.jetbrains.annotations.NotNull()
    java.util.List<can.siempredelao.f1kotlin.backend.model.QualifyingResult> qualifyingResults) {
        super();
    }
}