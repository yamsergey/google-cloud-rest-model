package ru.yamsergey.google.cloud.model.image.annotation;

import java.util.Objects;

public class Vertex {
  private int x;
  private int y;

  public Vertex(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  @Override
  public int hashCode() {return Objects.hash(x, y);}

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final Vertex other = (Vertex) obj;
    return Objects.equals(this.x, other.x)
        && Objects.equals(this.y, other.y);
  }
}
