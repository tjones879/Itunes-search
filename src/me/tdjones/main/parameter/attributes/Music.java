package me.tdjones.main.parameter.attributes;

import me.tdjones.main.parameter.Attribute;

public enum Music implements Attribute{
    MIX ("mixTerm"), GENRE_INDEX ("genreIndex"), ARTIST ("artistTerm"), COMPOSER ("composerTerm"),
    ALBUM ("albumTerm"), RATING_INDEX ("ratingIndex"), SONG ("songTerm");

    private final String value;

    Music(String value){
        this.value = value;
    }

    @Override
    public String createParameter() {
        return "attribute=" + value;
    }
}
