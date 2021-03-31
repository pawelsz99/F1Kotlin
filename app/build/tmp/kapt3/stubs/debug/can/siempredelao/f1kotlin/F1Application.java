package can.siempredelao.f1kotlin;

import java.lang.System;

/**
 * * Created by david on 23.09.18.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcan/siempredelao/f1kotlin/F1Application;", "Landroid/app/Application;", "Ldagger/android/HasActivityInjector;", "()V", "activityInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/app/Activity;", "getActivityInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setActivityInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "onCreate", "", "app_debug"})
public final class F1Application extends android.app.Application implements dagger.android.HasActivityInjector {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<android.app.Activity> activityInjector;
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<android.app.Activity> getActivityInjector() {
        return null;
    }
    
    public final void setActivityInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<android.app.Activity> p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.DispatchingAndroidInjector<android.app.Activity> activityInjector() {
        return null;
    }
    
    public F1Application() {
        super();
    }
}