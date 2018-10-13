package com.gisgroup.thanhcoquantri.base;

import android.app.Application;
import com.orhanobut.hawk.Hawk;
import com.orhanobut.hawk.NoEncryption;

public class GisGroupApplication extends Application {
  private static GisGroupApplication gisGroupApplicationInstance;

  public static GisGroupApplication getGisGroupApplicationInstance() {
    if(gisGroupApplicationInstance == null){
      gisGroupApplicationInstance = new GisGroupApplication();
    }
    return gisGroupApplicationInstance;
  }

  @Override public void onCreate() {
    super.onCreate();
    initHawk();
  }
  private void initHawk() {
    Hawk.init(this)
        .setEncryption(new NoEncryption())
        .build();
  }
}
