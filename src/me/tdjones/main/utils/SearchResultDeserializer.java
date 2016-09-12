package me.tdjones.main.utils;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import me.tdjones.main.result.SearchResult;
import me.tdjones.main.result.wrapper.Artist;
import me.tdjones.main.result.wrapper.Collection;
import me.tdjones.main.result.wrapper.Track;

import java.lang.reflect.Type;

public class SearchResultDeserializer implements JsonDeserializer<SearchResult>{
    @Override
    public SearchResult deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if(jsonElement == null){
            return null;
        }else {
            String wrapperType = jsonElement.getAsJsonObject().get("wrapperType").getAsString();
            switch (wrapperType){
                case "track":
                    return jsonDeserializationContext.deserialize(jsonElement, Track.class);
                case "artist":
                    return jsonDeserializationContext.deserialize(jsonElement, Artist.class);
                case "collection":
                    return jsonDeserializationContext.deserialize(jsonElement, Collection.class);
                default:
                    return null;
            }
        }
    }
}
