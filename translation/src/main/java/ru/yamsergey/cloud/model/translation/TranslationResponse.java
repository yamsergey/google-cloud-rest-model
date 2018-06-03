package ru.yamsergey.cloud.model.translation;

public class TranslationResponse {
  private Translations data;

  public TranslationResponse(Translations data) {
    this.data = data;
  }

  public Translations getData() {
    return data;
  }

  public void setData(Translations data) {
    this.data = data;
  }
}
