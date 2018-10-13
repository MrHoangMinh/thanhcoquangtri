// Generated code from Butter Knife. Do not modify!
package com.gisgroup.thanhcoquantri.base;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class BaseActivity$$ViewBinder<T extends com.gisgroup.thanhcoquantri.base.BaseActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230926, "field 'vToolBar'");
    target.vToolBar = finder.castView(view, 2131230926, "field 'vToolBar'");
    view = finder.findRequiredView(source, 2131230843, "field 'vNavigationView'");
    target.vNavigationView = finder.castView(view, 2131230843, "field 'vNavigationView'");
  }

  @Override public void unbind(T target) {
    target.vToolBar = null;
    target.vNavigationView = null;
  }
}
