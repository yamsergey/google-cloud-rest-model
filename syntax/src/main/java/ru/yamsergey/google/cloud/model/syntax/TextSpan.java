package ru.yamsergey.google.cloud.model.syntax;

import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class TextSpan {
  @Nullable private String content;
  private int beginOffset;

  public TextSpan(@Nullable String content, int beginOffset) {
    this.content = content;
    this.beginOffset = beginOffset;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public int getBeginOffset() {
    return beginOffset;
  }

  public void setBeginOffset(int beginOffset) {
    this.beginOffset = beginOffset;
  }

  @Override
  public int hashCode() {return Objects.hash(content, beginOffset);}

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final TextSpan other = (TextSpan) obj;
    return Objects.equals(this.content, other.content)
        && Objects.equals(this.beginOffset, other.beginOffset);
  }
}
