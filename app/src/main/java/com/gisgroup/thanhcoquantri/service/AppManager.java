package com.gisgroup.thanhcoquantri.service;

import com.gisgroup.thanhcoquantri.ui.map.MapAdapter;

public class AppManager {
  private static AppManager appManagerIntands;
  private int menuSelectedIndex;
  private MapAdapter mapAdapter;
  public AppManager() {
    this.menuSelectedIndex = 0;
  }

  public static AppManager getAppManagerIntands(){
    if(appManagerIntands == null){
      appManagerIntands = new AppManager();
    }
    return appManagerIntands;
  }

  public int getMenuSelectedIndex() {
    return menuSelectedIndex;
  }

  public void setMenuSelectedIndex(int menuSelectedIndex) {
    this.menuSelectedIndex = menuSelectedIndex;
  }

  public MapAdapter getMapAdapter() {
    return mapAdapter;
  }

  public void setMapAdapter(MapAdapter mapAdapter) {
    this.mapAdapter = mapAdapter;
  }
}
