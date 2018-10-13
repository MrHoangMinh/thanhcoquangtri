package com.gisgroup.thanhcoquantri.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.gisgroup.thanhcoquantri.R;
import com.gisgroup.thanhcoquantri.service.AppManager;
import com.gisgroup.thanhcoquantri.ui.applicaitonintroduce.IntroduceActivity;
import com.gisgroup.thanhcoquantri.ui.generainfomation.GeneralInforActivity;
import com.gisgroup.thanhcoquantri.ui.locationintroduce.LocationActivity;
import com.gisgroup.thanhcoquantri.ui.map.MapActivity;
import com.squareup.leakcanary.RefWatcher;

public class BaseActivity extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener,NavigationView.OnAttachStateChangeListener  {
  protected DrawerLayout drawer;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
    RefWatcher refWatcher = GisGroupApplication.getRefWatcher(this);
    refWatcher.watch(this);
  }

  protected void init(){
    ButterKnife.bind(this);
    drawer = (DrawerLayout) findViewById(R.id.drawer_layout_main);
  }

  @Override
  public void onBackPressed() {
    if (drawer.isDrawerOpen(GravityCompat.START)) {
      drawer.closeDrawer(GravityCompat.START);
    } else {
      super.onBackPressed();
    }
  }

  @SuppressWarnings("StatementWithEmptyBody")
  @Override
  public boolean onNavigationItemSelected(MenuItem item) {
    AppManager appManager = AppManager.getAppManagerIntands();
    int id = item.getItemId();
    Intent intent = null;
    if (id == R.id.nav_map) {
      appManager.setMenuSelectedIndex(0);
      intent = MapActivity.newIntent(this,true);
    } else if (id == R.id.nav_generalinfo) {
      appManager.setMenuSelectedIndex(1);
      intent = GeneralInforActivity.newIntent(this,true);
    } else if (id == R.id.nav_location) {
      appManager.setMenuSelectedIndex(2);
      intent = LocationActivity.newIntent(this,true);
    } else if (id == R.id.nav_introduce) {
      appManager.setMenuSelectedIndex(3);
      intent = IntroduceActivity.newIntent(this,true);
    }
    drawer.closeDrawer(GravityCompat.START);
    if (intent != null){
      startActivity(intent);
      finish();
    }
    return true;
  }

  @Override public void onViewAttachedToWindow(View view) {
    Log.e("NavigationView", "onViewAttachedToWindow");
  }

  @Override public void onViewDetachedFromWindow(View view) {
    Log.e("NavigationView", "onViewDetachedFromWindow");
  }

  @Override public void onPointerCaptureChanged(boolean hasCapture) {
    Log.e("NavigationView", "onPointerCaptureChanged " + hasCapture);
  }
}
