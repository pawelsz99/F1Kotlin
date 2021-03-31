package can.siempredelao.f1kotlin.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0002\u00a8\u0006\r"}, d2 = {"Lcan/siempredelao/f1kotlin/dagger/BackendModule;", "", "()V", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "okHttpClient", "Lokhttp3/OkHttpClient;", "provideBackend", "Lcan/siempredelao/f1kotlin/backend/Backend;", "retrofit", "Lretrofit2/Retrofit;", "Companion", "app_debug"})
@dagger.Module()
public final class BackendModule {
    private static final java.lang.String ENDPOINT = "http://ergast.com/api/f1/";
    public static final can.siempredelao.f1kotlin.dagger.BackendModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final can.siempredelao.f1kotlin.backend.Backend provideBackend() {
        return null;
    }
    
    private final retrofit2.Retrofit retrofit() {
        return null;
    }
    
    private final okhttp3.OkHttpClient okHttpClient() {
        return null;
    }
    
    private final com.google.gson.Gson gson() {
        return null;
    }
    
    public BackendModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcan/siempredelao/f1kotlin/dagger/BackendModule$Companion;", "", "()V", "ENDPOINT", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}