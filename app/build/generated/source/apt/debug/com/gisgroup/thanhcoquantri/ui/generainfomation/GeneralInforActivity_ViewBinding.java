// Generated code from Butter Knife. Do not modify!
package com.gisgroup.thanhcoquantri.ui.generainfomation;

import android.view.View;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import com.gisgroup.thanhcoquantri.R;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class GeneralInforActivity_ViewBinding<T extends GeneralInforActivity> implements Unbinder {
  protected T target;

  private View view2131230829;

  private View view2131230828;

  private View view2131230826;

  private View view2131230827;

  public GeneralInforActivity_ViewBinding(final T target, Finder finder, Object source) {
    this.target = target;

    View view;
    view = finder.findRequiredView(source, R.id.mainbuttonmap, "field 'mainButtonMap' and method 'onClick'");
    target.mainButtonMap = finder.castView(view, R.id.mainbuttonmap, "field 'mainButtonMap'", RelativeLayout.class);
    view2131230829 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, R.id.mainbuttonlocation, "field 'mainButtonLocation' and method 'onClick'");
    target.mainButtonLocation = finder.castView(view, R.id.mainbuttonlocation, "field 'mainButtonLocation'", RelativeLayout.class);
    view2131230828 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, R.id.mainbuttoninfo, "field 'mainButtonInfo' and method 'onClick'");
    target.mainButtonInfo = finder.castView(view, R.id.mainbuttoninfo, "field 'mainButtonInfo'", RelativeLayout.class);
    view2131230826 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, R.id.mainbuttonintroduce, "field 'mainButtonIntroduce' and method 'onClick'");
    target.mainButtonIntroduce = finder.castView(view, R.id.mainbuttonintroduce, "field 'mainButtonIntroduce'", RelativeLayout.class);
    view2131230827 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mainButtonMap = null;
    target.mainButtonLocation = null;
    target.mainButtonInfo = null;
    target.mainButtonIntroduce = null;

    view2131230829.setOnClickListener(null);
    view2131230829 = null;
    view2131230828.setOnClickListener(null);
    view2131230828 = null;
    view2131230826.setOnClickListener(null);
    view2131230826 = null;
    view2131230827.setOnClickListener(null);
    view2131230827 = null;

    this.target = null;
  }
}
