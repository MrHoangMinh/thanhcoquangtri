package com.gisgroup.thanhcoquantri.ui.map;

import com.gisgroup.thanhcoquantri.base.BaseViewModel;

public class MapViewModel extends BaseViewModel<MapViewModel.MapViewModelListener> {

  public MapViewModel(MapViewModelListener listener) {
    super(listener);
  }

  public interface MapViewModelListener extends BaseViewModel.MainListener{

  }
}
