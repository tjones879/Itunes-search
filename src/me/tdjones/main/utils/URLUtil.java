package me.tdjones.main.utils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class URLUtil {

    public static String buildSearchString(){
        return null;
    }

    public static URL buildSearchURL(String parameterString) {
        URL searchURL;
        try {
            searchURL = new URL(parameterString);
        }catch (MalformedURLException e) {
            e.printStackTrace();
            searchURL = null;
        }
        return searchURL;
    }

    public static HttpURLConnection openConnection(URL url){
        HttpURLConnection connection;
        try{
            connection = (HttpURLConnection) url.openConnection();
        } catch (IOException e){
            e.printStackTrace();
            connection = null;
        }
        return connection;
    }

}
