package me.tdjones.main.result;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class JSONResult {
    @Expose
    private int resultCount;
    @SerializedName("results")
    ArrayList<SearchResult> searchResults;

    public ArrayList<SearchResult> getSearchResults(){
        return searchResults;
    }
}
