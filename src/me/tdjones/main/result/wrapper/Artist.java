package me.tdjones.main.result.wrapper;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import me.tdjones.main.result.Kind;
import me.tdjones.main.result.SearchResult;

import java.net.URL;

public class Artist extends SearchResult {
    @Expose private String artistName;
    @Expose private int amgArtistId;
    @Expose private int primaryGenreId;
    @SerializedName("artistLinkUrl")
    private URL artistLinkUrl;

    Artist(String artistName){
        this.artistName = artistName;
    }

    @Override
    public String getTitle(){
        return artistName;
    }

    public void setKind(Kind kind){
        this.kind = kind;
    }
}
