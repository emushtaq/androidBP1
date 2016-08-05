package com.eshan.test.flu;

import android.accounts.AccountsException;
import android.app.Activity;

import com.eshan.test.flu.core.BootstrapService;

import java.io.IOException;

public interface BootstrapServiceProvider {
    BootstrapService getService(Activity activity) throws IOException, AccountsException;
}
