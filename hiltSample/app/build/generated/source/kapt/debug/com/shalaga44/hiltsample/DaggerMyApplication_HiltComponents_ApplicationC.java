package com.shalaga44.hiltsample;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.google.gson.Gson;
import com.shalaga44.hiltsample.di.RepositoryModule;
import com.shalaga44.hiltsample.di.RepositoryModule_ProvideMainRepositoryFactory;
import com.shalaga44.hiltsample.di.RetrofitModule;
import com.shalaga44.hiltsample.di.RetrofitModule_ProvideBlogServiceFactory;
import com.shalaga44.hiltsample.di.RetrofitModule_ProvideGsonBuilderFactory;
import com.shalaga44.hiltsample.di.RetrofitModule_ProvideRetrofitFactory;
import com.shalaga44.hiltsample.di.RoomModule;
import com.shalaga44.hiltsample.di.RoomModule_ProvideBlogDBFactory;
import com.shalaga44.hiltsample.di.RoomModule_ProvideBlogDaoFactory;
import com.shalaga44.hiltsample.repository.MainRepository;
import com.shalaga44.hiltsample.retrofit.BlogRetrofit;
import com.shalaga44.hiltsample.retrofit.NetworkMapper;
import com.shalaga44.hiltsample.room.BlogDao;
import com.shalaga44.hiltsample.room.BlogsDatabase;
import com.shalaga44.hiltsample.room.CacheMapper;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMyApplication_HiltComponents_ApplicationC extends MyApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private final RoomModule roomModule;

  private final RepositoryModule repositoryModule;

  private volatile Object blogsDatabase = new MemoizedSentinel();

  private volatile Object blogDao = new MemoizedSentinel();

  private volatile Object gson = new MemoizedSentinel();

  private volatile Object retrofitBuilder = new MemoizedSentinel();

  private volatile Object blogRetrofit = new MemoizedSentinel();

  private volatile Object mainRepository = new MemoizedSentinel();

  private volatile Provider<MainRepository> provideMainRepositoryProvider;

  private DaggerMyApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam,
      RepositoryModule repositoryModuleParam, RoomModule roomModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    this.roomModule = roomModuleParam;
    this.repositoryModule = repositoryModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private BlogsDatabase getBlogsDatabase() {
    Object local = blogsDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = blogsDatabase;
        if (local instanceof MemoizedSentinel) {
          local = RoomModule_ProvideBlogDBFactory.provideBlogDB(roomModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          blogsDatabase = DoubleCheck.reentrantCheck(blogsDatabase, local);
        }
      }
    }
    return (BlogsDatabase) local;
  }

  private BlogDao getBlogDao() {
    Object local = blogDao;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = blogDao;
        if (local instanceof MemoizedSentinel) {
          local = RoomModule_ProvideBlogDaoFactory.provideBlogDao(roomModule, getBlogsDatabase());
          blogDao = DoubleCheck.reentrantCheck(blogDao, local);
        }
      }
    }
    return (BlogDao) local;
  }

  private Gson getGson() {
    Object local = gson;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = gson;
        if (local instanceof MemoizedSentinel) {
          local = RetrofitModule_ProvideGsonBuilderFactory.provideGsonBuilder();
          gson = DoubleCheck.reentrantCheck(gson, local);
        }
      }
    }
    return (Gson) local;
  }

  private Retrofit.Builder getRetrofitBuilder() {
    Object local = retrofitBuilder;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofitBuilder;
        if (local instanceof MemoizedSentinel) {
          local = RetrofitModule_ProvideRetrofitFactory.provideRetrofit(getGson());
          retrofitBuilder = DoubleCheck.reentrantCheck(retrofitBuilder, local);
        }
      }
    }
    return (Retrofit.Builder) local;
  }

  private BlogRetrofit getBlogRetrofit() {
    Object local = blogRetrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = blogRetrofit;
        if (local instanceof MemoizedSentinel) {
          local = RetrofitModule_ProvideBlogServiceFactory.provideBlogService(getRetrofitBuilder());
          blogRetrofit = DoubleCheck.reentrantCheck(blogRetrofit, local);
        }
      }
    }
    return (BlogRetrofit) local;
  }

  private MainRepository getMainRepository() {
    Object local = mainRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = mainRepository;
        if (local instanceof MemoizedSentinel) {
          local = RepositoryModule_ProvideMainRepositoryFactory.provideMainRepository(repositoryModule, getBlogDao(), getBlogRetrofit(), new CacheMapper(), new NetworkMapper());
          mainRepository = DoubleCheck.reentrantCheck(mainRepository, local);
        }
      }
    }
    return (MainRepository) local;
  }

  private Provider<MainRepository> getMainRepositoryProvider() {
    Object local = provideMainRepositoryProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      provideMainRepositoryProvider = (Provider<MainRepository>) local;
    }
    return (Provider<MainRepository>) local;
  }

  @Override
  public void injectMyApplication(MyApplication myApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private RepositoryModule repositoryModule;

    private RoomModule roomModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder repositoryModule(RepositoryModule repositoryModule) {
      this.repositoryModule = Preconditions.checkNotNull(repositoryModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder retrofitModule(RetrofitModule retrofitModule) {
      Preconditions.checkNotNull(retrofitModule);
      return this;
    }

    public Builder roomModule(RoomModule roomModule) {
      this.roomModule = Preconditions.checkNotNull(roomModule);
      return this;
    }

    public MyApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (repositoryModule == null) {
        this.repositoryModule = new RepositoryModule();
      }
      if (roomModule == null) {
        this.roomModule = new RoomModule();
      }
      return new DaggerMyApplication_HiltComponents_ApplicationC(applicationContextModule, repositoryModule, roomModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MyApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MyApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MyApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements MyApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MyApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MyApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<MainViewModel_AssistedFactory> mainViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private MainViewModel_AssistedFactory getMainViewModel_AssistedFactory() {
        return new MainViewModel_AssistedFactory(DaggerMyApplication_HiltComponents_ApplicationC.this.getMainRepositoryProvider());
      }

      private Provider<MainViewModel_AssistedFactory> getMainViewModel_AssistedFactoryProvider() {
        Object local = mainViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          mainViewModel_AssistedFactoryProvider = (Provider<MainViewModel_AssistedFactory>) local;
        }
        return (Provider<MainViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>singletonMap("com.shalaga44.hiltsample.MainViewModel", (Provider) getMainViewModel_AssistedFactoryProvider());
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMyApplication_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements MyApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MyApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends MyApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMyApplication_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements MyApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MyApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends MyApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MyApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MyApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends MyApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.shalaga44.hiltsample.MainViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getMainViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements MyApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MyApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MyApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.shalaga44.hiltsample.repository.MainRepository 
        return (T) DaggerMyApplication_HiltComponents_ApplicationC.this.getMainRepository();

        default: throw new AssertionError(id);
      }
    }
  }
}
