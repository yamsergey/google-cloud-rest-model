package ru.yamsergey.google.cloud.model.image.annotation;

import java.util.Objects;

public class Color {
  private int red;
  private int green;
  private int blue;
  private int alpha;

  public Color(int red, int green, int blue, int alpha) {
    this.red = red;
    this.green = green;
    this.blue = blue;
    this.alpha = alpha;
  }

  public int getRed() {
    return red;
  }

  public void setRed(int red) {
    this.red = red;
  }

  public int getGreen() {
    return green;
  }

  public void setGreen(int green) {
    this.green = green;
  }

  public int getBlue() {
    return blue;
  }

  public void setBlue(int blue) {
    this.blue = blue;
  }

  public int getAlpha() {
    return alpha;
  }

  public void setAlpha(int alpha) {
    this.alpha = alpha;
  }

  @Override
  public int hashCode() {return Objects.hash(red, green, blue, alpha);}

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final Color other = (Color) obj;
    return Objects.equals(this.red, other.red)
        && Objects.equals(this.green, other.green)
        && Objects.equals(this.blue, other.blue)
        && Objects.equals(this.alpha, other.alpha);
  }
}
