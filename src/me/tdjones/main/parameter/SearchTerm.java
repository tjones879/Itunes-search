package me.tdjones.main.parameter;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class SearchTerm implements Parameter {
    private final String searchTerm;

    public SearchTerm (String searchTerm){
        try {
            this.searchTerm = URLEncoder.encode(searchTerm, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e){
            throw new AssertionError("UTF-8 not recognized.");
        }
    }

    public String getSearchTerm(){
        return searchTerm;
    }

    @Override
    public String createParameter() {
        return "term=" + searchTerm;
    }
}
