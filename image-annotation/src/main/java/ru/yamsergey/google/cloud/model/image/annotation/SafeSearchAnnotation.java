package ru.yamsergey.google.cloud.model.image.annotation;

import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class SafeSearchAnnotation {
  @Nullable private Likelihood adult;
  @Nullable private Likelihood spoof;
  @Nullable private Likelihood medical;
  @Nullable private Likelihood violence;

  public SafeSearchAnnotation(@Nullable Likelihood adult, @Nullable Likelihood spoof,
      @Nullable Likelihood medical, @Nullable Likelihood violence) {
    this.adult = adult;
    this.spoof = spoof;
    this.medical = medical;
    this.violence = violence;
  }

  public Likelihood getAdult() {
    return adult;
  }

  public void setAdult(Likelihood adult) {
    this.adult = adult;
  }

  public Likelihood getSpoof() {
    return spoof;
  }

  public void setSpoof(Likelihood spoof) {
    this.spoof = spoof;
  }

  public Likelihood getMedical() {
    return medical;
  }

  public void setMedical(Likelihood medical) {
    this.medical = medical;
  }

  public Likelihood getViolence() {
    return violence;
  }

  public void setViolence(Likelihood violence) {
    this.violence = violence;
  }

  @Override
  public int hashCode() {return Objects.hash(adult, spoof, medical, violence);}

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final SafeSearchAnnotation other = (SafeSearchAnnotation) obj;
    return Objects.equals(this.adult, other.adult)
        && Objects.equals(this.spoof, other.spoof)
        && Objects.equals(this.medical, other.medical)
        && Objects.equals(this.violence, other.violence);
  }
}
