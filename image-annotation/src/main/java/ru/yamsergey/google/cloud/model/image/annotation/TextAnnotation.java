package ru.yamsergey.google.cloud.model.image.annotation;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class TextAnnotation {

  @Nullable private String mid;
  @Nullable private String locale;
  @Nullable private String description;
  @Nullable private int score;
  @Nullable private int confidence;
  @Nullable private int topicality;
  @Nullable private BoundingPoly boundingPoly;
  @Nullable private List<LocationInfo> locations;
  @Nullable private List<Property> properties;

  public TextAnnotation(@Nullable String mid, @Nullable String locale, @Nullable String description, @Nullable int score,
      @Nullable int confidence, @Nullable int topicality,
      @Nullable BoundingPoly boundingPoly,
      @Nullable List<LocationInfo> locations,
      @Nullable List<Property> properties) {
    this.mid = mid;
    this.locale = locale;
    this.description = description;
    this.score = score;
    this.confidence = confidence;
    this.topicality = topicality;
    this.boundingPoly = boundingPoly;
    this.locations = locations;
    this.properties = properties;
  }

  public String getMid() {
    return mid;
  }

  public void setMid(String mid) {
    this.mid = mid;
  }

  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public int getConfidence() {
    return confidence;
  }

  public void setConfidence(int confidence) {
    this.confidence = confidence;
  }

  public int getTopicality() {
    return topicality;
  }

  public void setTopicality(int topicality) {
    this.topicality = topicality;
  }

  public BoundingPoly getBoundingPoly() {
    return boundingPoly;
  }

  public void setBoundingPoly(BoundingPoly boundingPoly) {
    this.boundingPoly = boundingPoly;
  }

  public List<LocationInfo> getLocations() {
    return locations;
  }

  public void setLocations(List<LocationInfo> locations) {
    this.locations = locations;
  }

  public List<Property> getProperties() {
    return properties;
  }

  public void setProperties(List<Property> properties) {
    this.properties = properties;
  }

  @Override
  public int hashCode() {return Objects.hash(mid, locale, description, score, confidence, topicality, boundingPoly, locations, properties);}

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final TextAnnotation other = (TextAnnotation) obj;
    return Objects.equals(this.mid, other.mid)
        && Objects.equals(this.locale, other.locale)
        && Objects.equals(this.description, other.description)
        && Objects.equals(this.score, other.score)
        && Objects.equals(this.confidence, other.confidence)
        && Objects.equals(this.topicality, other.topicality)
        && Objects.equals(this.boundingPoly, other.boundingPoly)
        && Objects.equals(this.locations, other.locations)
        && Objects.equals(this.properties, other.properties);
  }
}
