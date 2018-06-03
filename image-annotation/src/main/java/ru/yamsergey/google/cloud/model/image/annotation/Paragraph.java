package ru.yamsergey.google.cloud.model.image.annotation;

import java.util.List;
import org.jetbrains.annotations.Nullable;

public class Paragraph {
  @Nullable private TextProperty property;
  @Nullable private BoundingPoly boundingBox;
  private List<Word> words;
}
