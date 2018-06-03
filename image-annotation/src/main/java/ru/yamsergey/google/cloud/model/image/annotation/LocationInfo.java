package ru.yamsergey.google.cloud.model.image.annotation;

import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class LocationInfo {
  @Nullable private LatLng latLng;

  public LocationInfo(@Nullable LatLng latLng) {
    this.latLng = latLng;
  }

  public LatLng getLatLng() {
    return latLng;
  }

  public void setLatLng(LatLng latLng) {
    this.latLng = latLng;
  }

  @Override
  public int hashCode() {return Objects.hash(latLng);}

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final LocationInfo other = (LocationInfo) obj;
    return Objects.equals(this.latLng, other.latLng);
  }
}
