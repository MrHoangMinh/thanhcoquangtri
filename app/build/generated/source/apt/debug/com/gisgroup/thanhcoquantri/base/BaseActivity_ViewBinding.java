// Generated code from Butter Knife. Do not modify!
package com.gisgroup.thanhcoquantri.base;

import android.support.design.widget.NavigationView;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import com.gisgroup.thanhcoquantri.R;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class BaseActivity_ViewBinding<T extends BaseActivity> implements Unbinder {
  protected T target;

  public BaseActivity_ViewBinding(T target, Finder finder, Object source) {
    this.target = target;

    target.vNavigationView = finder.findRequiredViewAsType(source, R.id.nav_view, "field 'vNavigationView'", NavigationView.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.vNavigationView = null;

    this.target = null;
  }
}
