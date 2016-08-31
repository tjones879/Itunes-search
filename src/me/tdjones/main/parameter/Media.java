package me.tdjones.main.parameter;

public enum Media implements Parameter{
    MOVIE ("movie"), PODCAST ("podcast"), MUSIC ("music"), MUSIC_VIDEO ("musicVideo"),
    AUDIOBOOK ("audiobook"), SHORT_FILM ("shortFilm"), TV_SHOW ("tvShow"), SOFTWARE ("software"),
    EBOOK ("ebook"), ALL ("all");

    private final String value;

    Media(String value){
        this.value = value;
    }

    public String createParameter(){
        return "media=" + value;
    }
}
