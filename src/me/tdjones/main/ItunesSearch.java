package me.tdjones.main;

import me.tdjones.main.parameter.Attribute;
import me.tdjones.main.parameter.Entity;
import me.tdjones.main.parameter.Parameter;
import me.tdjones.main.parameter.SearchTerm;
import me.tdjones.main.results.SearchResult;
import me.tdjones.main.utils.JSONUtil;
import me.tdjones.main.utils.URLUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ItunesSearch {
    private static final String searchURL = "https://itunes.apple.com/search?";
    private SearchTerm searchTerm;
    private List<SearchResult> searchResults;
    private List<Parameter> parameters;

    public void itunesSearch(){
        parameters = new ArrayList<>();
    }

    public List<SearchResult> search(){
        searchResults = new ArrayList<>();
        URL searchURL = URLUtil.buildSearchURL(appendSearchParameters());
        HttpURLConnection connection = URLUtil.openConnection(searchURL);
        String string = convertStreamToString(connection.getInputStream());
        searchResults = JSONUtil.parseJSON(string);
        return searchResults;
    }

    public void addParameter(Parameter parameter){
        parameters.add(parameter);
    }

    public void addAttribute(Attribute attribute){
        parameters.add(attribute);
    }

    public void addEntity(Entity entity){
        parameters.add(entity);
    }

    public void setSearchTerm(SearchTerm searchTerm){
        this.searchTerm = searchTerm;
    }

    public String getSearchTerm(){
        return searchTerm.getSearchTerm();
    }

    /**
     *
     * @return
     */
    private String appendSearchParameters(){
        String parameterString = new String();
        parameterString += searchURL + searchTerm.createParameter();

        StringJoiner joiner = new StringJoiner("&");
        joiner.add(parameterString);

        for (Parameter parameter: parameters){
            joiner.add(parameter.createParameter());
        }

        return parameterString;
    }

    private String convertStreamToString(InputStream is){
        String line;
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null){
                sb.append(line + "\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return sb.toString();
    }

}
