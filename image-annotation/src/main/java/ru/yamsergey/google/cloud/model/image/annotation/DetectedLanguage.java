package ru.yamsergey.google.cloud.model.image.annotation;

import java.util.Objects;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

public class DetectedLanguage {
  @Nullable private String languageCode;
  @Nullable private Short confidence;

  public DetectedLanguage(@Nullable String languageCode, @Nullable Short confidence) {
    this.languageCode = languageCode;
    this.confidence = confidence;
  }

  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public Short getConfidence() {
    return confidence;
  }

  public void setConfidence(Short confidence) {
    this.confidence = confidence;
  }

  @Contract(value = "null -> false", pure = true)
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    DetectedLanguage that = (DetectedLanguage) obj;
    return Objects.equals(languageCode, that.languageCode) &&
        Objects.equals(confidence, that.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageCode, confidence);
  }
}
