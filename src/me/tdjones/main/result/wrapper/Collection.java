package me.tdjones.main.result.wrapper;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import me.tdjones.main.result.SearchResult;

import java.net.URL;
import java.util.Date;

public class Collection extends SearchResult {
    @Expose private int collectionId;
    @Expose private String artistName;
    @Expose private String collectionName;
    @Expose private String collectionCensoredName;
    @Expose private float collectionPrice;
    @Expose private String collectionExplicitness;
    @Expose private int trackCount;
    @Expose private String country;
    @Expose private String currency;
    @Expose private Date releaseDate;
    @Expose private String collectionType;
    @Expose private int amgArtistId;
    @Expose private String copyright;
    @SerializedName("artistViewUrl")
    private URL artistViewURL;
    @SerializedName("collectionViewUrl")
    private URL collectionViewURL;

    Collection(String collectionName){
        this.collectionName = collectionName;
    }

    @Override
    public String getTitle(){
        return collectionName;
    }
}
