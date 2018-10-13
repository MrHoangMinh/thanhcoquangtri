package com.gisgroup.thanhcoquantri.ui.home;

import com.gisgroup.thanhcoquantri.base.BaseViewModel;

public class HomeViewModel extends BaseViewModel<HomeViewModel.WellcomeViewModelListener> {

  public HomeViewModel(WellcomeViewModelListener listener) {
    super(listener);
  }

  public interface WellcomeViewModelListener extends BaseViewModel.MainListener{

  }
}
