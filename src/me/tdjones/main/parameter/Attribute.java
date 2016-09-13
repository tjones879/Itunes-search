package me.tdjones.main.parameter;

public interface Attribute extends Parameter{
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

}
