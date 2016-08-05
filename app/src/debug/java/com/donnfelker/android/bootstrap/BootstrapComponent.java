package com.eshan.test.flu;

import com.eshan.test.flu.authenticator.BootstrapAuthenticatorActivity;
import com.eshan.test.flu.core.TimerService;
import com.eshan.test.flu.ui.BootstrapActivity;
import com.eshan.test.flu.ui.BootstrapFragmentActivity;
import com.eshan.test.flu.ui.BootstrapTimerActivity;
import com.eshan.test.flu.ui.CheckInsListFragment;
import com.eshan.test.flu.ui.MainActivity;
import com.eshan.test.flu.ui.NavigationDrawerFragment;
import com.eshan.test.flu.ui.NewsActivity;
import com.eshan.test.flu.ui.NewsListFragment;
import com.eshan.test.flu.ui.UserActivity;
import com.eshan.test.flu.ui.UserListFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                AndroidModule.class,
                BootstrapModule.class
        }
)
public interface BootstrapComponent {

    void inject(BootstrapApplication target);

    void inject(BootstrapAuthenticatorActivity target);

    void inject(BootstrapTimerActivity target);

    void inject(MainActivity target);

    void inject(CheckInsListFragment target);

    void inject(NavigationDrawerFragment target);

    void inject(NewsActivity target);

    void inject(NewsListFragment target);

    void inject(UserActivity target);

    void inject(UserListFragment target);

    void inject(TimerService target);

    void inject(BootstrapFragmentActivity target);
    void inject(BootstrapActivity target);


}
