package com.gisgroup.thanhcoquantri.base;

import android.app.Application;
import android.content.Context;
import com.orhanobut.hawk.Hawk;
import com.orhanobut.hawk.NoEncryption;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

public class GisGroupApplication extends Application {
  private static GisGroupApplication gisGroupApplicationInstance;
  private RefWatcher refWatcher;

  public static GisGroupApplication getGisGroupApplicationInstance() {
    if(gisGroupApplicationInstance == null){
      gisGroupApplicationInstance = new GisGroupApplication();
    }
    return gisGroupApplicationInstance;
  }

  @Override public void onCreate() {
    super.onCreate();
    initHawk();
    refWatcher = LeakCanary.install(this);
  }
  private void initHawk() {
    Hawk.init(this)
        .setEncryption(new NoEncryption())
        .build();
  }
  public static RefWatcher getRefWatcher(Context context) {
    GisGroupApplication application = (GisGroupApplication) context.getApplicationContext();
    return application.refWatcher;
  }
}
