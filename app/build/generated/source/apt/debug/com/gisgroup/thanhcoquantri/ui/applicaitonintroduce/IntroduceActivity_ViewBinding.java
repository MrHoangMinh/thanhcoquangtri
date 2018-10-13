// Generated code from Butter Knife. Do not modify!
package com.gisgroup.thanhcoquantri.ui.applicaitonintroduce;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import com.gisgroup.thanhcoquantri.R;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class IntroduceActivity_ViewBinding<T extends IntroduceActivity> implements Unbinder {
  protected T target;

  private View view2131230859;

  public IntroduceActivity_ViewBinding(final T target, Finder finder, Object source) {
    this.target = target;

    View view;
    view = finder.findRequiredView(source, R.id.navigationMenuButton, "field 'vNavigationMenuButton' and method 'onClick'");
    target.vNavigationMenuButton = finder.castView(view, R.id.navigationMenuButton, "field 'vNavigationMenuButton'", ImageView.class);
    view2131230859 = view;
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

    target.vNavigationMenuButton = null;

    view2131230859.setOnClickListener(null);
    view2131230859 = null;

    this.target = null;
  }
}
