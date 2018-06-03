package ru.yamsergey.google.cloud.model.syntax;

import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Document {
  @NotNull
  private final Type type;
  @NotNull
  private final String language;
  @Nullable
  private final String content;
  @Nullable
  private final String gcsContentUri;

  public Document(@NotNull Type type, @NotNull String language, @Nullable String content, @Nullable String gcsContentUri) {
    super();
    this.type = type;
    this.language = language;
    this.content = content;
    this.gcsContentUri = gcsContentUri;
  }

  public Type getType() {
    return type;
  }

  public String getLanguage() {
    return language;
  }

  public String getContent() {
    return content;
  }

  public String getGcsContentUri() {
    return gcsContentUri;
  }

  @Override
  public int hashCode() {return Objects.hash(type, language, content, gcsContentUri);}

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final Document other = (Document) obj;
    return Objects.equals(this.type, other.type)
        && Objects.equals(this.language, other.language)
        && Objects.equals(this.content, other.content)
        && Objects.equals(this.gcsContentUri, other.gcsContentUri);
  }
}

