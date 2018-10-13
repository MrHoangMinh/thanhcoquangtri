package com.gisgroup.thanhcoquantri.ui.map;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.percent.PercentRelativeLayout;
import android.support.v4.view.GravityCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.OnClick;
import com.gisgroup.thanhcoquantri.R;
import com.gisgroup.thanhcoquantri.base.BaseActivity;
import com.gisgroup.thanhcoquantri.model.MapModel;
import com.gisgroup.thanhcoquantri.service.AppManager;
import com.gisgroup.thanhcoquantri.ui.applicaitonintroduce.IntroduceActivity;
import com.gisgroup.thanhcoquantri.ui.generainfomation.GeneralInforActivity;
import com.gisgroup.thanhcoquantri.ui.locationintroduce.LocationActivity;

public class MapActivity extends BaseActivity implements MapAdapter.MapAdapterListener {
  @BindView(R.id.listmaprecylerview)
  RecyclerView vListMapRecylerview;
  @BindView(R.id.navigationMenuButton)
  ImageView vNavigationMenuButton;
  @BindView(R.id.navigationMenuButtonDetail)
  ImageView vNavigationMenuButtonDetail;
  @BindView(R.id.maplayoutbartitle)
  TextView vMapLayoutBarTitle;
  @BindView(R.id.maplayoutbartitleDetail)
  TextView vMapLayoutBarTitleDetail;
  @BindView(R.id.imageMapDetail)
  ImageView vImageMapDetail;
  @BindView(R.id.map_view)
  PercentRelativeLayout vMapLayoutView;
  @BindView(R.id.map_view_detailt)
  PercentRelativeLayout vMapLayoutViewDetailt;
  @BindView(R.id.mapopenmap)
  RelativeLayout vOpenMapButotn;
  @BindView(R.id.mapdetailtlayoutimage)
  RelativeLayout vMapDetailtLayoutImage;
  @BindView(R.id.mapdetailtlayoutwebview)
  RelativeLayout vMapDetailtLayouWebview;
  @BindView(R.id.webviewmap)
  WebView mWebviewMap;


  private AppManager mAppManager;
  protected NavigationView vNavigationView;
  private MapAdapter mMapAdapter;
  private RecyclerView.LayoutManager mLayoutManager;
  private MapModel mapModel;

  private static String TAG = "MapActivity";
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_map);
    init();
  }
  public void init(){
    super.init();
    vNavigationView = (NavigationView)findViewById(R.id.nav_view);
    vNavigationView.setNavigationItemSelectedListener(this);
    vNavigationView.getMenu().getItem(AppManager.getAppManagerIntands().getMenuSelectedIndex()).setChecked(true);
    mAppManager = AppManager.getAppManagerIntands();
    if(mAppManager.getMapAdapter() == null){
      mMapAdapter = new MapAdapter();
      mAppManager.setMapAdapter(mMapAdapter);
    }else {
      mMapAdapter = mAppManager.getMapAdapter();
    }
    mMapAdapter.setListerner(this);
    vListMapRecylerview.setHasFixedSize(true);

    // use a linear layout manager
    mLayoutManager = new LinearLayoutManager(this);
    vListMapRecylerview.setLayoutManager(mLayoutManager);
    vListMapRecylerview.setAdapter(mMapAdapter);
    initWebview();
  }
  private void initWebview(){
    mWebviewMap.getSettings().setJavaScriptEnabled(true);
    mWebviewMap.getSettings().setRenderPriority(WebSettings.RenderPriority.LOW);
    mWebviewMap.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
    mWebviewMap.setWebViewClient(new WebViewClient());
  }
  @OnClick({R.id.maplayoutbartitle,R.id.navigationMenuButton,R.id.navigationMenuButtonDetail,R.id.mapopenmap})
  public void onClick(View view){
    switch (view.getId()){
      case R.id.navigationMenuButtonDetail:
        if(vMapDetailtLayouWebview.getVisibility() == View.VISIBLE){
          vMapDetailtLayouWebview.setVisibility(View.GONE);
          vMapDetailtLayoutImage.setVisibility(View.VISIBLE);
          return;
        }
        vMapLayoutViewDetailt.setVisibility(View.GONE);
        vMapLayoutView.setVisibility(View.VISIBLE);
        break;
      case R.id.navigationMenuButton:
          drawer.openDrawer(GravityCompat.START);
        break;
      case R.id.mapopenmap:
        vMapDetailtLayoutImage.setVisibility(View.GONE);
        vMapDetailtLayouWebview.setVisibility(View.VISIBLE);
        mWebviewMap.loadUrl(mapModel.getMapLink());
        break;

    }
  }
  public static Intent newIntent(Context context, boolean isClearTop) {
    if(context.getClass().getSimpleName().equals(TAG)){
      return null;
    }
    Intent intent = new Intent(context, MapActivity.class);
    if (isClearTop) {
      intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_SINGLE_TOP);
    } else {
      intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK);
    }
    return intent;
  }

  @Override public void onMapItemClick(MapModel model) {
    mapModel = model;
    if (vMapLayoutViewDetailt.getVisibility() != View.VISIBLE){
      vMapLayoutViewDetailt.setVisibility(View.VISIBLE);
      vMapLayoutView.setVisibility(View.GONE);
    }
    vMapLayoutBarTitleDetail.setText(mapModel.getMapName());
    vImageMapDetail.setBackground(getResources().getDrawable(mapModel.getMapImage()));
  }

  @Override protected void onDestroy() {
    super.onDestroy();
    mMapAdapter.setListerner(null);
    mWebviewMap.clearCache(true);
    mWebviewMap = null;
    vNavigationView.setNavigationItemSelectedListener(null);
    vNavigationView = null;
  }
}
