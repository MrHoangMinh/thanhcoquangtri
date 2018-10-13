// Generated code from Butter Knife. Do not modify!
package com.gisgroup.thanhcoquantri.ui.map;

import android.support.percent.PercentRelativeLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import com.gisgroup.thanhcoquantri.R;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class MapActivity_ViewBinding<T extends MapActivity> implements Unbinder {
  protected T target;

  private View view2131230859;

  private View view2131230860;

  private View view2131230843;

  private View view2131230845;

  public MapActivity_ViewBinding(final T target, Finder finder, Object source) {
    this.target = target;

    View view;
    target.vListMapRecylerview = finder.findRequiredViewAsType(source, R.id.listmaprecylerview, "field 'vListMapRecylerview'", RecyclerView.class);
    view = finder.findRequiredView(source, R.id.navigationMenuButton, "field 'vNavigationMenuButton' and method 'onClick'");
    target.vNavigationMenuButton = finder.castView(view, R.id.navigationMenuButton, "field 'vNavigationMenuButton'", ImageView.class);
    view2131230859 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, R.id.navigationMenuButtonDetail, "field 'vNavigationMenuButtonDetail' and method 'onClick'");
    target.vNavigationMenuButtonDetail = finder.castView(view, R.id.navigationMenuButtonDetail, "field 'vNavigationMenuButtonDetail'", ImageView.class);
    view2131230860 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, R.id.maplayoutbartitle, "field 'vMapLayoutBarTitle' and method 'onClick'");
    target.vMapLayoutBarTitle = finder.castView(view, R.id.maplayoutbartitle, "field 'vMapLayoutBarTitle'", TextView.class);
    view2131230843 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.vMapLayoutBarTitleDetail = finder.findRequiredViewAsType(source, R.id.maplayoutbartitleDetail, "field 'vMapLayoutBarTitleDetail'", TextView.class);
    target.vImageMapDetail = finder.findRequiredViewAsType(source, R.id.imageMapDetail, "field 'vImageMapDetail'", ImageView.class);
    target.vMapLayoutView = finder.findRequiredViewAsType(source, R.id.map_view, "field 'vMapLayoutView'", PercentRelativeLayout.class);
    target.vMapLayoutViewDetailt = finder.findRequiredViewAsType(source, R.id.map_view_detailt, "field 'vMapLayoutViewDetailt'", PercentRelativeLayout.class);
    view = finder.findRequiredView(source, R.id.mapopenmap, "field 'vOpenMapButotn' and method 'onClick'");
    target.vOpenMapButotn = finder.castView(view, R.id.mapopenmap, "field 'vOpenMapButotn'", RelativeLayout.class);
    view2131230845 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.vMapDetailtLayoutImage = finder.findRequiredViewAsType(source, R.id.mapdetailtlayoutimage, "field 'vMapDetailtLayoutImage'", RelativeLayout.class);
    target.vMapDetailtLayouWebview = finder.findRequiredViewAsType(source, R.id.mapdetailtlayoutwebview, "field 'vMapDetailtLayouWebview'", RelativeLayout.class);
    target.mWebviewMap = finder.findRequiredViewAsType(source, R.id.webviewmap, "field 'mWebviewMap'", WebView.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.vListMapRecylerview = null;
    target.vNavigationMenuButton = null;
    target.vNavigationMenuButtonDetail = null;
    target.vMapLayoutBarTitle = null;
    target.vMapLayoutBarTitleDetail = null;
    target.vImageMapDetail = null;
    target.vMapLayoutView = null;
    target.vMapLayoutViewDetailt = null;
    target.vOpenMapButotn = null;
    target.vMapDetailtLayoutImage = null;
    target.vMapDetailtLayouWebview = null;
    target.mWebviewMap = null;

    view2131230859.setOnClickListener(null);
    view2131230859 = null;
    view2131230860.setOnClickListener(null);
    view2131230860 = null;
    view2131230843.setOnClickListener(null);
    view2131230843 = null;
    view2131230845.setOnClickListener(null);
    view2131230845 = null;

    this.target = null;
  }
}
