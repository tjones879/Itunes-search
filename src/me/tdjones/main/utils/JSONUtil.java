package me.tdjones.main.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import me.tdjones.main.result.JSONResult;
import me.tdjones.main.result.SearchResult;

import java.util.List;

public class JSONUtil {
    public static List<SearchResult> parseJSON(String string){
        Gson gson = new GsonBuilder().registerTypeAdapter(SearchResult.class, new SearchResultDeserializer()).create();
        List<SearchResult> searchResults = gson.fromJson(string, JSONResult.class).getSearchResults();
        return searchResults;
    }
}
