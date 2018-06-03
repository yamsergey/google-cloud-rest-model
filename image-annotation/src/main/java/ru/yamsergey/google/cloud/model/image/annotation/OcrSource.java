package ru.yamsergey.google.cloud.model.image.annotation;

import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class OcrSource {
  @Nullable private String gcsImageUri;
  @Nullable private String imageUri;

  public OcrSource(@Nullable String gcsImageUri, @Nullable String imageUri) {
    this.gcsImageUri = gcsImageUri;
    this.imageUri = imageUri;
  }

  public String getGcsImageUri() {
    return gcsImageUri;
  }

  public void setGcsImageUri(String gcsImageUri) {
    this.gcsImageUri = gcsImageUri;
  }

  public String getImageUri() {
    return imageUri;
  }

  public void setImageUri(String imageUri) {
    this.imageUri = imageUri;
  }

  @Override
  public int hashCode() {return Objects.hash(gcsImageUri, imageUri);}

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final OcrSource other = (OcrSource) obj;
    return Objects.equals(this.gcsImageUri, other.gcsImageUri)
        && Objects.equals(this.imageUri, other.imageUri);
  }
}
