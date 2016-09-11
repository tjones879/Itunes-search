package me.tdjones.main.parameter.attributes;

import me.tdjones.main.parameter.Attribute;

public enum Podcast implements Attribute{
    TITLE ("titleTerm"), LANGUAGE ("languageTerm"), AUTHOR ("authorTerm"), GENRE("genreIndex"),
    ARTIST ("artistTerm"), RATING ("ratingIndex"), KEYWORDS ("keywordsTerm"),
    DESCRIPTION ("descriptionTerm");

    private final String value;

    Podcast(String value){
        this.value = value;
    }

    @Override
    public String createParameter() {
        return "attribute=" + value;
    }
}
