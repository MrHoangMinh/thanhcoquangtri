package com.gisgroup.thanhcoquantri.ui.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.gisgroup.thanhcoquantri.R;
import com.gisgroup.thanhcoquantri.base.BaseActivity;
import com.gisgroup.thanhcoquantri.base.GisGroupApplication;
import com.gisgroup.thanhcoquantri.service.AppManager;
import com.gisgroup.thanhcoquantri.ui.applicaitonintroduce.IntroduceActivity;
import com.gisgroup.thanhcoquantri.ui.generainfomation.GeneralInforActivity;
import com.gisgroup.thanhcoquantri.ui.locationintroduce.LocationActivity;
import com.gisgroup.thanhcoquantri.ui.map.MapActivity;

public class HomeActivity extends BaseActivity {
  private static String TAG = "HomeActivity";
  @BindView(R.id.mainbuttonmap)
  RelativeLayout mainButtonMap;
  @BindView(R.id.mainbuttonlocation)
  RelativeLayout mainButtonLocation;
  @BindView(R.id.mainbuttoninfo)
  RelativeLayout mainButtonInfo;
  @BindView(R.id.mainbuttonintroduce)
  RelativeLayout mainButtonIntroduce;
  protected NavigationView vNavigationView;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_wellcome);
    init();
  }
  public void init(){
    super.init();
    vNavigationView = (NavigationView)findViewById(R.id.nav_view);
    vNavigationView.setNavigationItemSelectedListener(this);
  }
  @OnClick({R.id.mainbuttonmap,R.id.mainbuttonlocation,R.id.mainbuttoninfo,R.id.mainbuttonintroduce})
  public void onClick(View view){
    switch (view.getId()){
      case R.id.mainbuttonmap:
      startActivity(MapActivity.newIntent(this,false));
        break;
      case R.id.mainbuttonlocation:
        startActivity(LocationActivity.newIntent(this,false));
        break;
      case R.id.mainbuttoninfo:
        startActivity(GeneralInforActivity.newIntent(this,false));
        break;
      case R.id.mainbuttonintroduce:
        startActivity(IntroduceActivity.newIntent(this,false));
        break;

    }
  }
  public static Intent newIntent(Context context, boolean isClearTop) {
    if(context.getClass().getSimpleName().equals(TAG)){
      return null;
    }
    Intent intent = new Intent(context, HomeActivity.class);
    if (isClearTop) {
      intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_SINGLE_TOP);
    } else {
      intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK);
    }
    return intent;
  }
}
