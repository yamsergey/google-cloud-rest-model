package ru.yamsergey.google.cloud.model.image.annotation;

import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class Property {

  @Nullable private String  name;
  @Nullable private String  value;
  @Nullable private String  uint64Value;

  public Property(@Nullable String name, @Nullable String value, @Nullable String uint64Value) {
    this.name = name;
    this.value = value;
    this.uint64Value = uint64Value;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getUint64Value() {
    return uint64Value;
  }

  public void setUint64Value(String uint64Value) {
    this.uint64Value = uint64Value;
  }

  @Override
  public int hashCode() {return Objects.hash(name, value, uint64Value);}

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final Property other = (Property) obj;
    return Objects.equals(this.name, other.name)
        && Objects.equals(this.value, other.value)
        && Objects.equals(this.uint64Value, other.uint64Value);
  }
}
