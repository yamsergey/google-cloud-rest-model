package ru.yamsergey.google.cloud.model.syntax;

import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class PartOfSpeech {
  @Nullable private Tag tag;
  @Nullable private Aspect aspect;
  @Nullable private Case aCase;
  @Nullable private Form form;
  @Nullable private Gender gender;
  @Nullable private Mood mood;
  @Nullable private Number number;
  @Nullable private Person person;
  @Nullable private Proper proper;
  @Nullable private Reciprocity reciprocity;
  @Nullable private Tense tense;
  @Nullable private Voice voice;

  public PartOfSpeech(@Nullable Tag tag, @Nullable Aspect aspect, @Nullable Case aCase,
      @Nullable Form form, @Nullable Gender gender, @Nullable Mood mood, @Nullable Number number,
      @Nullable Person person, @Nullable Proper proper, @Nullable Reciprocity reciprocity,
      @Nullable Tense tense, @Nullable Voice voice) {
    this.tag = tag;
    this.aspect = aspect;
    this.aCase = aCase;
    this.form = form;
    this.gender = gender;
    this.mood = mood;
    this.number = number;
    this.person = person;
    this.proper = proper;
    this.reciprocity = reciprocity;
    this.tense = tense;
    this.voice = voice;
  }

  public Tag getTag() {
    return tag;
  }

  public void setTag(Tag tag) {
    this.tag = tag;
  }

  public Aspect getAspect() {
    return aspect;
  }

  public void setAspect(Aspect aspect) {
    this.aspect = aspect;
  }

  public Case getCase() {
    return aCase;
  }

  public void setCase(Case aCase) {
    this.aCase = aCase;
  }

  public Form getForm() {
    return form;
  }

  public void setForm(Form form) {
    this.form = form;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public Mood getMood() {
    return mood;
  }

  public void setMood(Mood mood) {
    this.mood = mood;
  }

  public Number getNumber() {
    return number;
  }

  public void setNumber(Number number) {
    this.number = number;
  }

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public Proper getProper() {
    return proper;
  }

  public void setProper(Proper proper) {
    this.proper = proper;
  }

  public Reciprocity getReciprocity() {
    return reciprocity;
  }

  public void setReciprocity(Reciprocity reciprocity) {
    this.reciprocity = reciprocity;
  }

  public Tense getTense() {
    return tense;
  }

  public void setTense(Tense tense) {
    this.tense = tense;
  }

  public Voice getVoice() {
    return voice;
  }

  public void setVoice(Voice voice) {
    this.voice = voice;
  }

  @Override
  public int hashCode() {return Objects.hash(tag, aspect, aCase, form, gender, mood, number, person, proper, reciprocity, tense, voice);}

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final PartOfSpeech other = (PartOfSpeech) obj;
    return Objects.equals(this.tag, other.tag)
        && Objects.equals(this.aspect, other.aspect)
        && Objects.equals(this.aCase, other.aCase)
        && Objects.equals(this.form, other.form)
        && Objects.equals(this.gender, other.gender)
        && Objects.equals(this.mood, other.mood)
        && Objects.equals(this.number, other.number)
        && Objects.equals(this.person, other.person)
        && Objects.equals(this.proper, other.proper)
        && Objects.equals(this.reciprocity, other.reciprocity)
        && Objects.equals(this.tense, other.tense)
        && Objects.equals(this.voice, other.voice);
  }
}
