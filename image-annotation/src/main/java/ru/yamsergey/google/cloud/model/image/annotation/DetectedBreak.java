package ru.yamsergey.google.cloud.model.image.annotation;

import java.util.Objects;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

public class DetectedBreak {
  @Nullable
  private BreakType type;
  @Nullable
  private Boolean isPrefix;

  public DetectedBreak(@Nullable BreakType type, @Nullable Boolean isPrefix) {
    this.type = type;
    this.isPrefix = isPrefix;
  }

  public BreakType getType() {
    return type;
  }

  public void setType(BreakType type) {
    this.type = type;
  }

  public Boolean getPrefix() {
    return isPrefix;
  }

  public void setPrefix(Boolean prefix) {
    isPrefix = prefix;
  }

  @Override
  public int hashCode() {return Objects.hash(type, isPrefix);}

  @Contract(value = "null -> false", pure = true)
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final DetectedBreak other = (DetectedBreak) obj;
    return Objects.equals(this.type, other.type)
        && Objects.equals(this.isPrefix, other.isPrefix);
  }
}
