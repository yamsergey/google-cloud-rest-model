package ru.yamsergey.google.cloud.model.syntax;

public enum Tag {
  UNKNOWN,
  // Adjective
  ADJ,
  // Adposition (preposition and postposition)
  ADP,
  // Adverb
  ADV,
  // Conjunction
  CONJ,
  // Determiner
  DET,
  // Noun (common and proper)
  NOUN,
  // Cardinal number
  NUM,
  // Pronoun
  PRON,
  // Particle or other function word
  PRT,
  // Punctuation
  PUNCT,
  // Verb (all tenses and modes)
  VERB,
  // Other: foreign words, typos, abbreviations
  X,
  // Affix
  AFFIX
}
