package can.siempredelao.f1kotlin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0014J\f\u0010\u0018\u001a\u00020\u0014*\u00020\u0019H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcan/siempredelao/f1kotlin/MainActivity;", "Ldagger/android/DaggerActivity;", "()V", "backend", "Lcan/siempredelao/f1kotlin/backend/Backend;", "getBackend", "()Lcan/siempredelao/f1kotlin/backend/Backend;", "setBackend", "(Lcan/siempredelao/f1kotlin/backend/Backend;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "errorParser", "Lcan/siempredelao/f1kotlin/ErrorParser;", "getErrorParser", "()Lcan/siempredelao/f1kotlin/ErrorParser;", "setErrorParser", "(Lcan/siempredelao/f1kotlin/ErrorParser;)V", "racesAdapter", "Lcan/siempredelao/f1kotlin/RacesAdapter;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "toBeDisposed", "Lio/reactivex/disposables/Disposable;", "app_debug"})
public final class MainActivity extends dagger.android.DaggerActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public can.siempredelao.f1kotlin.backend.Backend backend;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public can.siempredelao.f1kotlin.ErrorParser errorParser;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private can.siempredelao.f1kotlin.RacesAdapter racesAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final can.siempredelao.f1kotlin.backend.Backend getBackend() {
        return null;
    }
    
    public final void setBackend(@org.jetbrains.annotations.NotNull()
    can.siempredelao.f1kotlin.backend.Backend p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final can.siempredelao.f1kotlin.ErrorParser getErrorParser() {
        return null;
    }
    
    public final void setErrorParser(@org.jetbrains.annotations.NotNull()
    can.siempredelao.f1kotlin.ErrorParser p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void toBeDisposed(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable $receiver) {
    }
    
    public MainActivity() {
        super();
    }
}