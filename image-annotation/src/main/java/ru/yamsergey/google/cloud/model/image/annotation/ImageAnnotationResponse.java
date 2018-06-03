package ru.yamsergey.google.cloud.model.image.annotation;

import java.util.List;
import java.util.Objects;

public class ImageAnnotationResponse {
  private List<FaceAnnotation> faceAnnotations;
  private List<LandmarkAnnotation> landmarkAnnotations;
  private List<LogoAnnotation> logoAnnotations;
  private List<LabelAnnotation> labelAnnotations;
  private List<TextAnnotation> textAnnotations;
  private FullTextAnnotation fullTextAnnotation;
  private SafeSearchAnnotation safeSearchAnnotation;
  private ImagePropertiesAnnotation imagePropertiesAnnotation;
  private CropHintsAnnotation cropHintsAnnotation;
  private WebDetection webDetection;
  private Status error;

  public ImageAnnotationResponse(List<FaceAnnotation> faceAnnotations, List<LandmarkAnnotation> landmarkAnnotations, List<LogoAnnotation> logoAnnotations,
      List<LabelAnnotation> labelAnnotations, List<TextAnnotation> textAnnotations, FullTextAnnotation fullTextAnnotation,
      SafeSearchAnnotation safeSearchAnnotation, ImagePropertiesAnnotation imagePropertiesAnnotation,
      CropHintsAnnotation cropHintsAnnotation, WebDetection webDetection, Status error) {
    this.faceAnnotations = faceAnnotations;
    this.landmarkAnnotations = landmarkAnnotations;
    this.logoAnnotations = logoAnnotations;
    this.labelAnnotations = labelAnnotations;
    this.textAnnotations = textAnnotations;
    this.fullTextAnnotation = fullTextAnnotation;
    this.safeSearchAnnotation = safeSearchAnnotation;
    this.imagePropertiesAnnotation = imagePropertiesAnnotation;
    this.cropHintsAnnotation = cropHintsAnnotation;
    this.webDetection = webDetection;
    this.error = error;
  }

  public List<FaceAnnotation> getFaceAnnotations() {
    return faceAnnotations;
  }

  public void setFaceAnnotations(List<FaceAnnotation> faceAnnotations) {
    this.faceAnnotations = faceAnnotations;
  }

  public List<LandmarkAnnotation> getLandmarkAnnotations() {
    return landmarkAnnotations;
  }

  public void setLandmarkAnnotations(List<LandmarkAnnotation> landmarkAnnotations) {
    this.landmarkAnnotations = landmarkAnnotations;
  }

  public List<LogoAnnotation> getLogoAnnotations() {
    return logoAnnotations;
  }

  public void setLogoAnnotations(List<LogoAnnotation> logoAnnotations) {
    this.logoAnnotations = logoAnnotations;
  }

  public List<LabelAnnotation> getLabelAnnotations() {
    return labelAnnotations;
  }

  public void setLabelAnnotations(List<LabelAnnotation> labelAnnotations) {
    this.labelAnnotations = labelAnnotations;
  }

  public List<TextAnnotation> getTextAnnotations() {
    return textAnnotations;
  }

  public void setTextAnnotations(List<TextAnnotation> textAnnotations) {
    this.textAnnotations = textAnnotations;
  }

  public FullTextAnnotation getFullTextAnnotation() {
    return fullTextAnnotation;
  }

  public void setFullTextAnnotation(FullTextAnnotation fullTextAnnotation) {
    this.fullTextAnnotation = fullTextAnnotation;
  }

  public SafeSearchAnnotation getSafeSearchAnnotation() {
    return safeSearchAnnotation;
  }

  public void setSafeSearchAnnotation(SafeSearchAnnotation safeSearchAnnotation) {
    this.safeSearchAnnotation = safeSearchAnnotation;
  }

  public ImagePropertiesAnnotation getImagePropertiesAnnotation() {
    return imagePropertiesAnnotation;
  }

  public void setImagePropertiesAnnotation(ImagePropertiesAnnotation imagePropertiesAnnotation) {
    this.imagePropertiesAnnotation = imagePropertiesAnnotation;
  }

  public CropHintsAnnotation getCropHintsAnnotation() {
    return cropHintsAnnotation;
  }

  public void setCropHintsAnnotation(CropHintsAnnotation cropHintsAnnotation) {
    this.cropHintsAnnotation = cropHintsAnnotation;
  }

  public WebDetection getWebDetection() {
    return webDetection;
  }

  public void setWebDetection(WebDetection webDetection) {
    this.webDetection = webDetection;
  }

  public Status getError() {
    return error;
  }

  public void setError(Status error) {
    this.error = error;
  }

  @Override
  public int hashCode() {
    return Objects.hash(faceAnnotations, landmarkAnnotations, logoAnnotations, labelAnnotations, textAnnotations, fullTextAnnotation, safeSearchAnnotation,
        imagePropertiesAnnotation, cropHintsAnnotation, webDetection, error);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final ImageAnnotationResponse other = (ImageAnnotationResponse) obj;
    return Objects.equals(this.faceAnnotations, other.faceAnnotations)
        && Objects.equals(this.landmarkAnnotations, other.landmarkAnnotations)
        && Objects.equals(this.logoAnnotations, other.logoAnnotations)
        && Objects.equals(this.labelAnnotations, other.labelAnnotations)
        && Objects.equals(this.textAnnotations, other.textAnnotations)
        && Objects.equals(this.fullTextAnnotation, other.fullTextAnnotation)
        && Objects.equals(this.safeSearchAnnotation, other.safeSearchAnnotation)
        && Objects.equals(this.imagePropertiesAnnotation, other.imagePropertiesAnnotation)
        && Objects.equals(this.cropHintsAnnotation, other.cropHintsAnnotation)
        && Objects.equals(this.webDetection, other.webDetection)
        && Objects.equals(this.error, other.error);
  }
}
