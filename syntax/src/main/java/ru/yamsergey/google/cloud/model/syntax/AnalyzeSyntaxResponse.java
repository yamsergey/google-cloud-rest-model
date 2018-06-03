package ru.yamsergey.google.cloud.model.syntax;

import java.util.List;

public class AnalyzeSyntaxResponse {
  private List<Sentence> sentences;
  private List<Token> tokens;
  private String language;

  public AnalyzeSyntaxResponse(List<Sentence> sentences, List<Token> tokens, String language) {
    this.sentences = sentences;
    this.tokens = tokens;
    this.language = language;
  }

  public List<Sentence> getSentences() {
    return sentences;
  }

  public void setSentences(List<Sentence> sentences) {
    this.sentences = sentences;
  }

  public List<Token> getTokens() {
    return tokens;
  }

  public void setTokens(List<Token> tokens) {
    this.tokens = tokens;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }
}
