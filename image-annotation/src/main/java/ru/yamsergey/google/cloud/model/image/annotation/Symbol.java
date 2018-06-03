package ru.yamsergey.google.cloud.model.image.annotation;

import org.jetbrains.annotations.Nullable;

public class Symbol {
  @Nullable private TextProperty property;
  @Nullable private BoundingPoly boundingBox;
  @Nullable private String text;
}
