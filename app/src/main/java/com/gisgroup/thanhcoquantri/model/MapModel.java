package com.gisgroup.thanhcoquantri.model;

public class MapModel {
  private String mapName;
  private String mapLink;
  private int mapImage;

  public MapModel(String mapName, String mapLink, int mapImage) {
    this.mapName = mapName;
    this.mapLink = mapLink;
    this.mapImage = mapImage;
  }

  public String getMapName() {
    return mapName;
  }

  public void setMapName(String mapName) {
    this.mapName = mapName;
  }

  public String getMapLink() {
    return mapLink;
  }

  public void setMapLink(String mapLink) {
    this.mapLink = mapLink;
  }

  public int getMapImage() {
    return mapImage;
  }

  public void setMapImage(int mapImage) {
    this.mapImage = mapImage;
  }
}
