package com.gisgroup.thanhcoquantri.ui.map;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.gisgroup.thanhcoquantri.R;
import com.gisgroup.thanhcoquantri.model.MapModel;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapAdapter extends RecyclerView.Adapter<MapAdapter.RecyclerViewHolder>{
  private ArrayList<MapModel> data;
  private MapAdapterListener mMapAdapterListener;
  private List<String> dataName =
      Arrays.asList("Hệ thống chỉ đường Di tích Thành cổ Quảng Trị",
          "Di tích lịch sử Thành cổ Quảng Trị và sự kiện 81 ngày đêm 1972",
          "Kiến trúc của Thành Quảng Trị so với một số kiến trúc thành lũy phong kiến Việt Nam",
          "Story Map Tour  Cụm Thành cổ Quảng Trị",
          "Thành cổ Quảng Trị trong Tour di sản Quảng Trị",
          "Thành cổ Quảng Trị trong hệ thống các di sản Việt Nam",
          "Thành cổ Quảng Trị trong hệ thống các di sản UNESCO tại Việt Nam",
          "Thành cổ Quảng Trị trong hệ thống du lịch sinh thái");
  private List<String> dataLink =
      Arrays.asList("http://camlohighschool.maps.arcgis.com/apps/Directions/index.html?appid=f37de54a797444c7a3f4b54ac7b69dfc",
          "https://arcg.is/1mjyiz",
          "https://arcg.is/1Dj9KD",
          "http://arcg.is/2uVeUyM",
          "http://arcg.is/2uvAaIZ",
          "https://arcg.is/1W9G5G",
          "https://arcg.is/1q9jeD",
          "https://arcg.is/0f14y9");
  private List<Integer> dataimage =
      Arrays.asList(R.drawable.giaodienbando,
          R.drawable.thanhcoquantritrenkhong,
          R.drawable.sodothanhquantri1895,
          R.drawable.giaodienbando4,
          R.drawable.giaodienbando5,
          R.drawable.giaodienbando6,
          R.drawable.giaodienbando7,
          R.drawable.giaodienbando8);


  public MapAdapter() {
    data = new ArrayList<>();
    for (int i = 0; i < dataName.size(); i++){
      data.add(new MapModel(dataName.get(i),dataLink.get(i), dataimage.get(i)));
    }
  }

  @Override
  public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    LayoutInflater inflater = LayoutInflater.from(parent.getContext());
    View view = inflater.inflate(R.layout.map_item, parent, false);
    return new RecyclerViewHolder(view);
  }

  @Override
  public void onBindViewHolder(RecyclerViewHolder holder, final int position) {
    holder.tvMapdescription.setText(data.get(position).getMapName());
    holder.buttonRoot.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        mMapAdapterListener.onMapItemClick(data.get(position));
      }
    });
  }

  @Override
  public int getItemCount() {
    return data.size();
  }


  public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    TextView tvMapdescription;
    RelativeLayout buttonRoot;
    public RecyclerViewHolder(View itemView) {
      super(itemView);
      tvMapdescription = (TextView) itemView.findViewById(R.id.map_item_view);
      buttonRoot = (RelativeLayout)itemView.findViewById(R.id.mapitemroot);
    }
  }
  public void setListerner(MapAdapterListener listerner){
    this.mMapAdapterListener = listerner;
  }
  public interface MapAdapterListener{
    void onMapItemClick(MapModel mapModel);
  }
}