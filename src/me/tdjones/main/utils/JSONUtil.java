package me.tdjones.main.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import me.tdjones.main.result.JSONResult;
import me.tdjones.main.result.SearchResult;
import me.tdjones.main.result.SearchResultList;

import java.util.ArrayList;
import java.util.List;

public class JSONUtil {
    public static SearchResultList parseJSON(String string){
        Gson gson = new GsonBuilder().registerTypeAdapter(SearchResult.class, new SearchResultDeserializer()).create();
        ArrayList<SearchResult> searchResults = gson.fromJson(string, JSONResult.class).getSearchResults();

        SearchResultList searchResultList = new SearchResultList(searchResults);
        return searchResultList;
    }
}
