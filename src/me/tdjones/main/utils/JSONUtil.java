package me.tdjones.main.utils;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import me.tdjones.main.result.JSONResult;
import me.tdjones.main.result.SearchResult;
import me.tdjones.main.result.wrapper.Artist;
import me.tdjones.main.result.wrapper.Collection;
import me.tdjones.main.result.wrapper.Track;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JSONUtil {
    public static List<SearchResult> parseJSON(String string){
        Gson gson = new GsonBuilder().registerTypeAdapter(SearchResult.class, new SearchResultDeserializer()).create();
        List<SearchResult> searchResults = gson.fromJson(string, JSONResult.class).getSearchResults();
        return searchResults;
    }
}
