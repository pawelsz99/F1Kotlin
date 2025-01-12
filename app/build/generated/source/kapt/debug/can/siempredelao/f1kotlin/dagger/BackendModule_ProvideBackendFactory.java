// Generated by Dagger (https://google.github.io/dagger).
package can.siempredelao.f1kotlin.dagger;

import can.siempredelao.f1kotlin.backend.Backend;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class BackendModule_ProvideBackendFactory implements Factory<Backend> {
  private final BackendModule module;

  public BackendModule_ProvideBackendFactory(BackendModule module) {
    this.module = module;
  }

  @Override
  public Backend get() {
    return provideInstance(module);
  }

  public static Backend provideInstance(BackendModule module) {
    return proxyProvideBackend(module);
  }

  public static BackendModule_ProvideBackendFactory create(BackendModule module) {
    return new BackendModule_ProvideBackendFactory(module);
  }

  public static Backend proxyProvideBackend(BackendModule instance) {
    return Preconditions.checkNotNull(
        instance.provideBackend(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
