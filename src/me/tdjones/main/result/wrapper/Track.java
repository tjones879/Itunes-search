package me.tdjones.main.result.wrapper;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import me.tdjones.main.result.SearchResult;

import java.net.URL;
import java.util.Date;

public class Track extends SearchResult {
    @Expose private String trackName;
    @SerializedName("trackTimeMillis") private int trackTime;
    @SerializedName("previewUrl") private URL previewURL;
    @SerializedName("artistViewUrl") private URL artistViewURL;
    @Expose private int artistId;
    @Expose private int collectionId;
    @Expose private int trackId;
    @Expose private String artistName;
    @Expose private String collectionName;
    @Expose private String collectionCensoredName;
    @Expose private String trackCensoredName;
    @SerializedName("collectionViewUrl") private URL collectionViewURL;
    @SerializedName("trackViewUrl") private URL trackViewURL;
    @Expose private float collectionPrice;
    @Expose private float trackPrice;
    @Expose private Date releaseDate;
    @Expose private String collectionExplicitness;
    @Expose private String trackExplicitness;
    @Expose private int discCount;
    @Expose private int discNumber;
    @Expose private int trackCount;
    @Expose private int trackNumber;
    @Expose private String country;
    @Expose private String currency;
    @Expose private String primaryGenreName;
    @Expose private boolean isStreamable;

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
