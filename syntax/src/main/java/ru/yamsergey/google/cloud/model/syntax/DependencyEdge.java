package ru.yamsergey.google.cloud.model.syntax;

import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class DependencyEdge {
  private int headTokenIndex;
  @Nullable private Label label;

  public DependencyEdge(int headTokenIndex, @Nullable Label label) {
    this.headTokenIndex = headTokenIndex;
    this.label = label;
  }

  public int getHeadTokenIndex() {
    return headTokenIndex;
  }

  public void setHeadTokenIndex(int headTokenIndex) {
    this.headTokenIndex = headTokenIndex;
  }

  public Label getLabel() {
    return label;
  }

  public void setLabel(Label label) {
    this.label = label;
  }

  @Override
  public int hashCode() {return Objects.hash(headTokenIndex, label);}

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final DependencyEdge other = (DependencyEdge) obj;
    return Objects.equals(this.headTokenIndex, other.headTokenIndex)
        && Objects.equals(this.label, other.label);
  }
}
