package com.gisgroup.thanhcoquantri.ui.generainfomation;

import com.gisgroup.thanhcoquantri.base.BaseViewModel;

public class GeneralInfoViewModel extends BaseViewModel<GeneralInfoViewModel.WellcomeViewModelListener> {

  public GeneralInfoViewModel(WellcomeViewModelListener listener) {
    super(listener);
  }

  public interface WellcomeViewModelListener extends BaseViewModel.MainListener{

  }
}
