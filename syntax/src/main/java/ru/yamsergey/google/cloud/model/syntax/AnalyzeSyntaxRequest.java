package ru.yamsergey.google.cloud.model.syntax;

public class AnalyzeSyntaxRequest {
  private Document document;
  private EncodingType encodingType;

  public AnalyzeSyntaxRequest(Document document, EncodingType encodingType) {
    this.document = document;
    this.encodingType = encodingType;
  }

  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  public EncodingType getEncodingType() {
    return encodingType;
  }

  public void setEncodingType(EncodingType encodingType) {
    this.encodingType = encodingType;
  }
}
