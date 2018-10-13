package com.gisgroup.thanhcoquantri.ui.locationintroduce;

import com.gisgroup.thanhcoquantri.base.BaseViewModel;

public class LocationViewModel extends BaseViewModel<LocationViewModel.MapViewModelListener> {

  public LocationViewModel(MapViewModelListener listener) {
    super(listener);
  }

  public interface MapViewModelListener extends BaseViewModel.MainListener{

  }
}
