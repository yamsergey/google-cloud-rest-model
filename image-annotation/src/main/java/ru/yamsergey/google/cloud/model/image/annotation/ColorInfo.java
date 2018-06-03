package ru.yamsergey.google.cloud.model.image.annotation;

import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class ColorInfo {
  @Nullable
  private Color color;
  private int score;
  private int pixelFraction;

  public ColorInfo(@Nullable Color color, int score, int pixelFraction) {
    this.color = color;
    this.score = score;
    this.pixelFraction = pixelFraction;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public int getPixelFraction() {
    return pixelFraction;
  }

  public void setPixelFraction(int pixelFraction) {
    this.pixelFraction = pixelFraction;
  }

  @Override
  public int hashCode() {return Objects.hash(color, score, pixelFraction);}

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final ColorInfo other = (ColorInfo) obj;
    return Objects.equals(this.color, other.color)
        && Objects.equals(this.score, other.score)
        && Objects.equals(this.pixelFraction, other.pixelFraction);
  }
}
