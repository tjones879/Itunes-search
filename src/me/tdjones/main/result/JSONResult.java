package me.tdjones.main.result;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JSONResult {
    @Expose
    private int resultCount;
    @SerializedName("results")
    List<SearchResult> searchResults;

    public List<SearchResult> getSearchResults(){
        return searchResults;
    }
}
