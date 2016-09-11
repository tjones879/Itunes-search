package me.tdjones.main.result.wrapper;

import com.google.gson.annotations.Expose;
import me.tdjones.main.result.Kind;
import me.tdjones.main.result.SearchResult;

public class Artist extends SearchResult {
    @Expose
    private final String artistName;

    Artist(String artistName){
        this.artistName = artistName;
    }

    @Override
    public String getName(){
        return artistName;
    }

    public void setKind(Kind kind){
        this.kind = kind;
    }
}
