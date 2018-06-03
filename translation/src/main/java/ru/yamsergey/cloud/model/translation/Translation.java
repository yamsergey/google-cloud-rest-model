package ru.yamsergey.cloud.model.translation;

import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class Translation {
  @Nullable private String detectedSourceLanguage;
  @Nullable private String translatedText;

  public Translation(@Nullable String detectedSourceLanguage, @Nullable String translatedText) {
    this.detectedSourceLanguage = detectedSourceLanguage;
    this.translatedText = translatedText;
  }

  public String getDetectedSourceLanguage() {
    return detectedSourceLanguage;
  }

  public void setDetectedSourceLanguage(String detectedSourceLanguage) {
    this.detectedSourceLanguage = detectedSourceLanguage;
  }

  public String getTranslatedText() {
    return translatedText;
  }

  public void setTranslatedText(String translatedText) {
    this.translatedText = translatedText;
  }

  @Override
  public int hashCode() {return Objects.hash(detectedSourceLanguage, translatedText);}

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final Translation other = (Translation) obj;
    return Objects.equals(this.detectedSourceLanguage, other.detectedSourceLanguage)
        && Objects.equals(this.translatedText, other.translatedText);
  }
}
