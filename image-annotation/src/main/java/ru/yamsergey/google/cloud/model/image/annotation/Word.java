package ru.yamsergey.google.cloud.model.image.annotation;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class Word {

  @Nullable private TextProperty property;
  @Nullable private BoundingPoly boundingBox;
  @Nullable private List<Symbol> symbols;

  public Word(@Nullable TextProperty property, @Nullable BoundingPoly boundingBox,
      @Nullable List<Symbol> symbols) {
    this.property = property;
    this.boundingBox = boundingBox;
    this.symbols = symbols;
  }

  public TextProperty getProperty() {
    return property;
  }

  public void setProperty(TextProperty property) {
    this.property = property;
  }

  public BoundingPoly getBoundingBox() {
    return boundingBox;
  }

  public void setBoundingBox(BoundingPoly boundingBox) {
    this.boundingBox = boundingBox;
  }

  public List<Symbol> getSymbols() {
    return symbols;
  }

  public void setSymbols(List<Symbol> symbols) {
    this.symbols = symbols;
  }

  @Override
  public int hashCode() {return Objects.hash(property, boundingBox, symbols);}

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final Word other = (Word) obj;
    return Objects.equals(this.property, other.property)
        && Objects.equals(this.boundingBox, other.boundingBox)
        && Objects.equals(this.symbols, other.symbols);
  }
}
