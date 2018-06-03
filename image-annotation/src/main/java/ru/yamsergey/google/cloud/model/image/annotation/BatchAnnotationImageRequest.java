package ru.yamsergey.google.cloud.model.image.annotation;

import java.util.List;

public class BatchAnnotationImageRequest {
  private List<ImageAnnotationRequest> requests;

  public BatchAnnotationImageRequest(List<ImageAnnotationRequest> requests) {
    this.requests = requests;
  }

  public List<ImageAnnotationRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<ImageAnnotationRequest> requests) {
    this.requests = requests;
  }
}
