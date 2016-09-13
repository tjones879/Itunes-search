package me.tdjones.main.result.wrapper;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import me.tdjones.main.result.SearchResult;

import java.net.URL;
import java.util.Date;

public class Track extends SearchResult {
    @Expose private String trackName;
    @Expose private int collectionId;
    @Expose private int trackId;
    @Expose private String artistName;
    @Expose private String collectionName;
    @Expose private String collectionCensoredName;
    @Expose private String trackCensoredName;
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
    @Expose private boolean isStreamable;
    @SerializedName("trackTimeMillis")
    private int trackTime;
    @SerializedName("previewUrl")
    private URL previewURL;
    @SerializedName("artistViewUrl")
    private URL artistViewURL;
    @SerializedName("collectionViewUrl")
    private URL collectionViewURL;
    @SerializedName("trackViewUrl")
    private URL trackViewURL;

    public int getCollectionId() {
        return collectionId;
    }

    public int getTrackId() {
        return trackId;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public String getCollectionCensoredName() {
        return collectionCensoredName;
    }

    public String getTrackCensoredName() {
        return trackCensoredName;
    }

    public float getCollectionPrice() {
        return collectionPrice;
    }

    public float getTrackPrice() {
        return trackPrice;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public String getCollectionExplicitness() {
        return collectionExplicitness;
    }

    public String getTrackExplicitness() {
        return trackExplicitness;
    }

    public int getDiscCount() {
        return discCount;
    }

    public int getDiscNumber() {
        return discNumber;
    }

    public int getTrackCount() {
        return trackCount;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getCurrency() {
        return currency;
    }

    public boolean isStreamable() {
        return isStreamable;
    }

    public URL getPreviewURL() {
        return previewURL;
    }

    public URL getArtistViewURL() {
        return artistViewURL;
    }

    public URL getCollectionViewURL() {
        return collectionViewURL;
    }

    public URL getTrackViewURL() {
        return trackViewURL;
    }

    @Override
    public String getTitle(){
        return trackName;
    }

    /**
     * Gets the length of the track in milliseconds.
     * @return
     */
    public int getTrackTime(){
        return trackTime;
    }


}
