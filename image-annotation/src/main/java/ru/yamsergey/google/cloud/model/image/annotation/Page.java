package ru.yamsergey.google.cloud.model.image.annotation;

import java.util.List;
import org.jetbrains.annotations.Nullable;

public class Page {
  @Nullable private TextProperty property;
  private long width;
  private long height;
  @Nullable private List<Block> blocks;
}
