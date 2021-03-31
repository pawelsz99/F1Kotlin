package can.siempredelao.f1kotlin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 12\u00020\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0015H\u0014J&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eH\u0002J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u001eH\u0002J\u000e\u0010\'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,H\u0002J\u0016\u0010-\u001a\u00020\u00152\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002J\n\u0010/\u001a\u00020\u0015*\u000200R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcan/siempredelao/f1kotlin/RaceDetailsActivity;", "Ldagger/android/DaggerActivity;", "()V", "backend", "Lcan/siempredelao/f1kotlin/backend/Backend;", "getBackend", "()Lcan/siempredelao/f1kotlin/backend/Backend;", "setBackend", "(Lcan/siempredelao/f1kotlin/backend/Backend;)V", "clock", "Lcan/siempredelao/f1kotlin/data/Clock;", "getClock", "()Lcan/siempredelao/f1kotlin/data/Clock;", "setClock", "(Lcan/siempredelao/f1kotlin/data/Clock;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "round", "", "season", "fetchFastestLap", "", "fetchPodium", "fetchPoleman", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "packPodiumToList", "", "Lcan/siempredelao/f1kotlin/backend/model/Result;", "r1", "r2", "r3", "showError", "throwable", "", "showFastestLap", "result", "showPoleman", "driver", "Lcan/siempredelao/f1kotlin/backend/model/Driver;", "showRace", "race", "Lcan/siempredelao/f1kotlin/backend/model/Race;", "showResults", "podiumList", "toBeDisposed", "Lio/reactivex/disposables/Disposable;", "Companion", "app_debug"})
public final class RaceDetailsActivity extends dagger.android.DaggerActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public can.siempredelao.f1kotlin.backend.Backend backend;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public can.siempredelao.f1kotlin.data.Clock clock;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private java.lang.String season;
    private java.lang.String round;
    private static final java.lang.String SEASON_EXTRA_KEY = "season_extra";
    private static final java.lang.String ROUND_EXTRA_KEY = "round_extra";
    public static final can.siempredelao.f1kotlin.RaceDetailsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final can.siempredelao.f1kotlin.backend.Backend getBackend() {
        return null;
    }
    
    public final void setBackend(@org.jetbrains.annotations.NotNull()
    can.siempredelao.f1kotlin.backend.Backend p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final can.siempredelao.f1kotlin.data.Clock getClock() {
        return null;
    }
    
    public final void setClock(@org.jetbrains.annotations.NotNull()
    can.siempredelao.f1kotlin.data.Clock p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showRace(can.siempredelao.f1kotlin.backend.model.Race race) {
    }
    
    private final void showError(java.lang.Throwable throwable) {
    }
    
    private final void fetchPoleman() {
    }
    
    public final void showPoleman(@org.jetbrains.annotations.NotNull()
    can.siempredelao.f1kotlin.backend.model.Driver driver) {
    }
    
    private final void fetchPodium() {
    }
    
    private final java.util.List<can.siempredelao.f1kotlin.backend.model.Result> packPodiumToList(can.siempredelao.f1kotlin.backend.model.Result r1, can.siempredelao.f1kotlin.backend.model.Result r2, can.siempredelao.f1kotlin.backend.model.Result r3) {
        return null;
    }
    
    private final void showResults(java.util.List<can.siempredelao.f1kotlin.backend.model.Result> podiumList) {
    }
    
    private final void fetchFastestLap() {
    }
    
    private final void showFastestLap(can.siempredelao.f1kotlin.backend.model.Result result) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public final void toBeDisposed(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable $receiver) {
    }
    
    public RaceDetailsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcan/siempredelao/f1kotlin/RaceDetailsActivity$Companion;", "", "()V", "ROUND_EXTRA_KEY", "", "SEASON_EXTRA_KEY", "openRaceDetailsIntent", "Landroid/content/Intent;", "season", "round", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent openRaceDetailsIntent(@org.jetbrains.annotations.NotNull()
        java.lang.String season, @org.jetbrains.annotations.NotNull()
        java.lang.String round, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}