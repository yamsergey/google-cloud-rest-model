package ru.yamsergey.google.cloud.model.image.annotation;

import java.util.List;

public class BatchAnnotationImageResponse {
  private List<ImageAnnotationResponse> responses;

  public BatchAnnotationImageResponse(List<ImageAnnotationResponse> responses) {
    this.responses = responses;
  }

  public List<ImageAnnotationResponse> getResponses() {
    return responses;
  }

  public void setResponses(List<ImageAnnotationResponse> responses) {
    this.responses = responses;
  }
}
