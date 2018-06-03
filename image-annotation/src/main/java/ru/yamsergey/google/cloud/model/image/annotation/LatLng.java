package ru.yamsergey.google.cloud.model.image.annotation;

import java.util.Objects;

public class LatLng {
  private long latitude;
  private long longitude;

  public LatLng(long latitude, long longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public long getLatitude() {
    return latitude;
  }

  public void setLatitude(long latitude) {
    this.latitude = latitude;
  }

  public long getLongitude() {
    return longitude;
  }

  public void setLongitude(long longitude) {
    this.longitude = longitude;
  }

  @Override
  public int hashCode() {return Objects.hash(latitude, longitude);}

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final LatLng other = (LatLng) obj;
    return Objects.equals(this.latitude, other.latitude)
        && Objects.equals(this.longitude, other.longitude);
  }
}
