package ru.yamsergey.cloud.model.translation;

import java.util.List;
import java.util.Objects;

public class Translations {
  private List<Translation> translations;

  public Translations(List<Translation> translations) {
    this.translations = translations;
  }

  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  @Override
  public int hashCode() {return Objects.hash(translations);}

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final Translations other = (Translations) obj;
    return Objects.equals(this.translations, other.translations);
  }
}
