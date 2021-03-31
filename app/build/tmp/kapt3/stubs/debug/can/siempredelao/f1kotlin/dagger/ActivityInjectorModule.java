package can.siempredelao.f1kotlin.dagger;

import java.lang.System;

/**
 * * Created by david on 23.09.18.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcan/siempredelao/f1kotlin/dagger/ActivityInjectorModule;", "", "()V", "mainActivity", "Lcan/siempredelao/f1kotlin/MainActivity;", "raceDetailsActivity", "Lcan/siempredelao/f1kotlin/RaceDetailsActivity;", "app_debug"})
@dagger.Module()
public abstract class ActivityInjectorModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract can.siempredelao.f1kotlin.MainActivity mainActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract can.siempredelao.f1kotlin.RaceDetailsActivity raceDetailsActivity();
    
    public ActivityInjectorModule() {
        super();
    }
}