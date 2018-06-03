package ru.yamsergey.google.cloud.model.syntax;

import java.util.Objects;

public class Sentiment {
  private int magnitude;
  private int score;

  public Sentiment(int magnitude, int score) {
    this.magnitude = magnitude;
    this.score = score;
  }

  public int getMagnitude() {
    return magnitude;
  }

  public void setMagnitude(int magnitude) {
    this.magnitude = magnitude;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  @Override
  public int hashCode() {return Objects.hash(magnitude, score);}

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final Sentiment other = (Sentiment) obj;
    return Objects.equals(this.magnitude, other.magnitude)
        && Objects.equals(this.score, other.score);
  }
}
