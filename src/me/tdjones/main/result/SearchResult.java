package me.tdjones.main.result;

import com.google.gson.annotations.Expose;

import java.net.URL;

public abstract class SearchResult {
    @Expose
    protected URL artworkURL;
    @Expose
    protected Kind kind;
    @Expose
    protected URL viewURL;
    @Expose
    protected boolean explicit;

    public abstract String getName();

    public URL getArtworkURL(){
        return artworkURL;
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
}
