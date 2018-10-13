// Generated code from Butter Knife. Do not modify!
package com.gisgroup.thanhcoquantri.ui.home;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class HomeActivity$$ViewBinder<T extends com.gisgroup.thanhcoquantri.ui.home.HomeActivity> extends com.gisgroup.thanhcoquantri.base.BaseActivity$$ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    super.bind(finder, target, source);

    View view;
    view = finder.findRequiredView(source, 2131230828, "field 'mainButtonMap'");
    target.mainButtonMap = finder.castView(view, 2131230828, "field 'mainButtonMap'");
    view = finder.findRequiredView(source, 2131230827, "field 'mainButtonLocation'");
    target.mainButtonLocation = finder.castView(view, 2131230827, "field 'mainButtonLocation'");
    view = finder.findRequiredView(source, 2131230825, "field 'mainButtonInfo'");
    target.mainButtonInfo = finder.castView(view, 2131230825, "field 'mainButtonInfo'");
    view = finder.findRequiredView(source, 2131230826, "field 'mainButtonIntroduce'");
    target.mainButtonIntroduce = finder.castView(view, 2131230826, "field 'mainButtonIntroduce'");
  }

  @Override public void unbind(T target) {
    super.unbind(target);

    target.mainButtonMap = null;
    target.mainButtonLocation = null;
    target.mainButtonInfo = null;
    target.mainButtonIntroduce = null;
  }
}
