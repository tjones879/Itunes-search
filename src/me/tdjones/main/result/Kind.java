package me.tdjones.main.result;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public enum Kind {
    @SerializedName("book") BOOK ("book"),
    @SerializedName("album") ALBUM ("album"),
    @SerializedName("coached-audio") COACHED_AUDIO ("coached-audio"),
    @SerializedName("feature-movie") FEATURE_MOVIE ("feature-movie"),
    @SerializedName("interactive-booklet") INTERACTIVE_BOOKLET ("interactive-booklet"),
    @SerializedName("music-video") MUSIC_VIDEO ("music-video"),
    @SerializedName("pdf podcast") PDF_PODCAST ("pdf-podcast"),
    @SerializedName("podcast-episode") PODCAST_EPISODE ("podcast-episode"),
    @SerializedName("software-package") SOFTWARE_PACKAGE ("software-package"),
    @SerializedName("song") SONG ("song"),
    @SerializedName("tv-episode") TV_EPISODE ("tv-episode"),
    @SerializedName("artist") ARTIST ("artist");

    private String value;

    Kind(String value){
        this.value = value;
    }
}
