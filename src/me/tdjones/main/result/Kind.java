package me.tdjones.main.result;

public enum Kind {
    BOOK ("book"), ALBUM ("album"), COACHED_AUDIO ("coached-audio"), FEATURE_MOVIE ("feature-movie"),
    INTERACTIVE_BOOKLET ("interactive-booklet"), MUSIC_VIDEO ("music-video"), PDF_PODCAST ("pdf podcast"),
    PODCAST_EPISODE ("podcast-episode"), SOFTWARE_PACKAGE ("software-package"), SONG ("song"),
    TV_EPISODE ("tv-episode"), ARTIST ("artist");

    private String value;

    Kind(String value){
        this.value = value;
    }
}
