package can.siempredelao.f1kotlin.dagger;

import android.app.Activity;
import can.siempredelao.f1kotlin.RaceDetailsActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityInjectorModule_RaceDetailsActivity.RaceDetailsActivitySubcomponent.class
)
public abstract class ActivityInjectorModule_RaceDetailsActivity {
  private ActivityInjectorModule_RaceDetailsActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(RaceDetailsActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      RaceDetailsActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface RaceDetailsActivitySubcomponent extends AndroidInjector<RaceDetailsActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RaceDetailsActivity> {}
  }
}
