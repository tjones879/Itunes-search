package me.tdjones.main.result;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.net.URL;

public abstract class SearchResult {
    @SerializedName("artworkUrl30")
    protected URL artworkURL30;
    @SerializedName("artworkUrl60")
    protected URL artworkURL60;
    @SerializedName("artworkUrl100")
    protected URL artworkURL100;
    @SerializedName("kind")
    protected Kind kind;
    @Expose protected int artistId;
    @Expose protected URL viewURL;
    @Expose protected boolean explicit;
    @Expose protected String primaryGenreName;

    public abstract String getTitle();

    public URL getArtworkURL(){
        return artworkURL30;
    }

    public Kind getKind(){
        return kind;
    }

    public URL getViewURL(){
        return viewURL;
    }

    public boolean getExplicit(){
        return explicit;
    }

    public int getArtistId(){
        return artistId;
    }

    public String getPrimaryGenreName(){
        return primaryGenreName;
    }
}
