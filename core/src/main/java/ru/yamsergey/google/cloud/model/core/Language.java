package ru.yamsergey.google.cloud.model.core;

public enum Language {
  ChineseSimplified(Constants.ZH),
  ChineseTraditional(Constants.ZH_HANT),
  English(Constants.EN),
  French(Constants.FR),
  German(Constants.DE),
  Italian(Constants.IT),
  Japanese(Constants.JA),
  Korean(Constants.KO),
  Portuguese(Constants.PT),
  Spanish(Constants.ES),
  Russian(Constants.RU),
  Unknown("unknown");

  private final String code;

  Language(String code) {this.code = code;}

  public static Language fromCode(String code) {
    switch (code) {
      case Constants.ZH: return ChineseSimplified;
      case Constants.ZH_HANT: return ChineseTraditional;
      case Constants.EN: return English;
      case Constants.FR: return French;
      case Constants.DE: return German;
      case Constants.IT: return Italian;
      case Constants.JA: return Japanese;
      case Constants.KO: return Korean;
      case Constants.PT: return Portuguese;
      case Constants.ES: return Spanish;
      case Constants.RU: return Russian;
      default: return Unknown;
    }
  }

  public String getCode() {
    return code;
  }

  private static class Constants {

    static final String ZH = "zh";
    static final String ZH_HANT = "zh-Hant";
    static final String EN = "en";
    static final String FR = "fr";
    static final String DE = "de";
    static final String IT = "it";
    static final String JA = "ja";
    static final String KO = "ko";
    static final String PT = "pt";
    static final String ES = "es";
    static final String RU = "ru";
  }
}
