package com.gisgroup.thanhcoquantri.ui.applicaitonintroduce;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.OnClick;
import com.gisgroup.thanhcoquantri.R;
import com.gisgroup.thanhcoquantri.base.BaseActivity;
import com.gisgroup.thanhcoquantri.service.AppManager;
import com.gisgroup.thanhcoquantri.ui.generainfomation.GeneralInforActivity;
import com.gisgroup.thanhcoquantri.ui.locationintroduce.LocationActivity;
import com.gisgroup.thanhcoquantri.ui.map.MapActivity;

public class IntroduceActivity extends BaseActivity {
  private static String TAG = "IntroduceActivity";
  @BindView(R.id.navigationMenuButton)
  ImageView vNavigationMenuButton;
  protected NavigationView vNavigationView;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_introduce);
    init();
  }
  public void init(){
    super.init();
    vNavigationView = (NavigationView)findViewById(R.id.nav_view);
    vNavigationView.setNavigationItemSelectedListener(this);
    vNavigationView.getMenu().getItem(AppManager.getAppManagerIntands().getMenuSelectedIndex()).setChecked(true);

  }
  @OnClick({R.id.navigationMenuButton})
  public void onClick(View view){
    switch (view.getId()){
      case R.id.navigationMenuButton:
        drawer.openDrawer(GravityCompat.START);
        break;

    }
  }
  public static Intent newIntent(Context context, boolean isClearTop) {
    if(context.getClass().getSimpleName().equals(TAG)){
      return null;
    }
    Intent intent = new Intent(context, IntroduceActivity.class);
    if (isClearTop) {
      intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_SINGLE_TOP);
    } else {
      intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK);
    }
    return intent;
  }

  @Override protected void onDestroy() {
    super.onDestroy();
    vNavigationView.setNavigationItemSelectedListener(null);
    vNavigationView = null;
  }
}
