package com.gisgroup.thanhcoquantri.base;

import android.content.Context;
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

public class BaseActivity extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener,NavigationView.OnAttachStateChangeListener  {
  protected DrawerLayout drawer;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
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
    // Handle navigation view item clicks here.
    AppManager appManager = AppManager.getAppManagerIntands();
    int id = item.getItemId();

    if (id == R.id.nav_map) {
      // Handle the camera action
      appManager.setMenuSelectedIndex(0);
      startActivity(MapActivity.newIntent(this,true));
      finish();
    } else if (id == R.id.nav_generalinfo) {
      appManager.setMenuSelectedIndex(1);
      startActivity(GeneralInforActivity.newIntent(this,true));
      finish();

    } else if (id == R.id.nav_location) {
      appManager.setMenuSelectedIndex(2);
      startActivity(LocationActivity.newIntent(this,true));
      finish();
    } else if (id == R.id.nav_introduce) {
      appManager.setMenuSelectedIndex(3);
      startActivity(IntroduceActivity.newIntent(this,true));
      finish();
    }
    drawer.closeDrawer(GravityCompat.START);
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
