package ru.yamsergey.google.cloud.model.image.annotation;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class TextProperty {
  @Nullable private List<DetectedLanguage> detectedLanguages;
  @Nullable private DetectedBreak detectedBreak;

  public TextProperty(@Nullable List<DetectedLanguage> detectedLanguages,
      @Nullable DetectedBreak detectedBreak) {
    this.detectedLanguages = detectedLanguages;
    this.detectedBreak = detectedBreak;
  }

  public List<DetectedLanguage> getDetectedLanguages() {
    return detectedLanguages;
  }

  public void setDetectedLanguages(List<DetectedLanguage> detectedLanguages) {
    this.detectedLanguages = detectedLanguages;
  }

  public DetectedBreak getDetectedBreak() {
    return detectedBreak;
  }

  public void setDetectedBreak(DetectedBreak detectedBreak) {
    this.detectedBreak = detectedBreak;
  }

  @Override
  public int hashCode() {return Objects.hash(detectedLanguages, detectedBreak);}

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final TextProperty other = (TextProperty) obj;
    return Objects.equals(this.detectedLanguages, other.detectedLanguages)
        && Objects.equals(this.detectedBreak, other.detectedBreak);
  }
}
