package ru.yamsergey.google.cloud.model.image.annotation;

import org.jetbrains.annotations.Nullable;

public class Block {
  @Nullable private TextProperty property;
  @Nullable private BoundingPoly boundingBox;
  @Nullable private Paragraph paragraphs;
  @Nullable private BlockType blockType;
}
