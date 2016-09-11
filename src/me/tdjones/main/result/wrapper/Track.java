package me.tdjones.main.result.wrapper;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import me.tdjones.main.result.SearchResult;

import java.net.URL;

public class Track extends SearchResult {
    @Expose
    private final String trackName;
    @SerializedName("trackTimeMillis")
    private final int trackTime;
    @Expose
    private final URL previewURL;

    Track(String trackName, int trackTime, URL previewURL, URL artworkURL){
        this.trackName = trackName;
        this.trackTime = trackTime;
        this.previewURL = previewURL;
        this.artworkURL = artworkURL;
    }

    @Override
    public String getName(){
        return trackName;
    }

    /**
     * Gets the length of the track in milliseconds.
     * @return
     */
    public int getTrackTime(){
        return trackTime;
    }

    public URL getPreviewURL(){
        return previewURL;
    }
}
