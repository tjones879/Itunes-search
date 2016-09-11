package me.tdjones.main.parameter.attributes;

import me.tdjones.main.parameter.Attribute;

public enum Movie implements Attribute{
    ACTOR ("actorTerm"), GENRE_INDEX ("genreIndex"), ARTIST ("artistTerm"),
    SHORT_FILM ("shortFilmTerm"), PRODUCER ("producerTerm"), RATING_TERM ("ratingTerm"),
    DIRECTOR ("directorTerm"), RELEASE_YEAR ("releaseYearTerm"), FEATURE_FILM ("featureFilmTerm"),
    MOVIE_ARTIST ("movieArtistTerm"), MOVIE ("movieTerm"), RATING_INDEX ("ratingIndex"),
    DESCRIPTION ("descriptionTerm");

    private final String value;

    Movie(String value){
        this.value = value;
    }

    @Override
    public String createParameter() {
        return "attribute=" + value;
    }
}
