package com.gisgroup.thanhcoquantri.ui.applicaitonintroduce;

import com.gisgroup.thanhcoquantri.base.BaseViewModel;

public class IntroduceViewModel extends BaseViewModel<IntroduceViewModel.WellcomeViewModelListener> {

  public IntroduceViewModel(WellcomeViewModelListener listener) {
    super(listener);
  }

  public interface WellcomeViewModelListener extends BaseViewModel.MainListener{

  }
}
