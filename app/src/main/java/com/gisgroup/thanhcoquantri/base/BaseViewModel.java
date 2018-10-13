package com.gisgroup.thanhcoquantri.base;

import java.lang.ref.WeakReference;

public abstract class BaseViewModel<T extends BaseViewModel.MainListener>{

  private WeakReference<T> mMainListenerWeakReference;

  public BaseViewModel(T listener) {
    mMainListenerWeakReference = new WeakReference<>(listener);
  }

  protected T getMainListener() {
    if (mMainListenerWeakReference != null) {
      return mMainListenerWeakReference.get();
    } else {
      return null;
    }
  }

  protected void onDestroy() {
    mMainListenerWeakReference = null;
  }

  public interface MainListener {
    void onShowErorMessage();
  }
}
