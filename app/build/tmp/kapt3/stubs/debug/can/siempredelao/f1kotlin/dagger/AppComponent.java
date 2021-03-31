package can.siempredelao.f1kotlin.dagger;

import java.lang.System;

/**
 * * Created by david on 11.02.17.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcan/siempredelao/f1kotlin/dagger/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcan/siempredelao/f1kotlin/F1Application;", "Builder", "app_debug"})
@dagger.Component(modules = {can.siempredelao.f1kotlin.dagger.AppModule.class, can.siempredelao.f1kotlin.dagger.BackendModule.class, dagger.android.AndroidInjectionModule.class, can.siempredelao.f1kotlin.dagger.ActivityInjectorModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<can.siempredelao.f1kotlin.F1Application> {
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcan/siempredelao/f1kotlin/dagger/AppComponent$Builder;", "Ldagger/android/AndroidInjector$Builder;", "Lcan/siempredelao/f1kotlin/F1Application;", "()V", "app_debug"})
    @dagger.Component.Builder()
    public static abstract class Builder extends dagger.android.AndroidInjector.Builder<can.siempredelao.f1kotlin.F1Application> {
        
        public Builder() {
            super();
        }
    }
}