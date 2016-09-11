package me.tdjones.main.result.wrapper;

import com.google.gson.annotations.Expose;
import me.tdjones.main.result.SearchResult;

public class Collection extends SearchResult {
    @Expose
    private final String collectionName;

    Collection(String collectionName){
        this.collectionName = collectionName;
    }

    @Override
    public String getName(){
        return collectionName;
    }
}
