package ru.yamsergey.google.cloud.model.syntax;

import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class Token {
  @Nullable private TextSpan text;
  @Nullable private PartOfSpeech partOfSpeech;
  @Nullable private DependencyEdge dependencyEdge;
  @Nullable private String lemma;

  public Token(@Nullable TextSpan text, @Nullable PartOfSpeech partOfSpeech,
      @Nullable DependencyEdge dependencyEdge, @Nullable String lemma) {
    this.text = text;
    this.partOfSpeech = partOfSpeech;
    this.dependencyEdge = dependencyEdge;
    this.lemma = lemma;
  }

  public TextSpan getText() {
    return text;
  }

  public void setText(TextSpan text) {
    this.text = text;
  }

  public PartOfSpeech getPartOfSpeech() {
    return partOfSpeech;
  }

  public void setPartOfSpeech(PartOfSpeech partOfSpeech) {
    this.partOfSpeech = partOfSpeech;
  }

  public DependencyEdge getDependencyEdge() {
    return dependencyEdge;
  }

  public void setDependencyEdge(DependencyEdge dependencyEdge) {
    this.dependencyEdge = dependencyEdge;
  }

  public String getLemma() {
    return lemma;
  }

  public void setLemma(String lemma) {
    this.lemma = lemma;
  }

  @Override
  public int hashCode() {return Objects.hash(text, partOfSpeech, dependencyEdge, lemma);}

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final Token other = (Token) obj;
    return Objects.equals(this.text, other.text)
        && Objects.equals(this.partOfSpeech, other.partOfSpeech)
        && Objects.equals(this.dependencyEdge, other.dependencyEdge)
        && Objects.equals(this.lemma, other.lemma);
  }
}
