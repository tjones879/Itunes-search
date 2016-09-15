package me.tdjones.main.result;

import java.util.ArrayList;
import java.util.List;

public class SearchResultList extends ArrayList<SearchResult> {
    public SearchResultList(List<SearchResult> searchResultList){
        if(searchResultList != null) {
            this.addAll(searchResultList);
        }
    }

    @SuppressWarnings("unchecked")
    public <T extends SearchResult> List<T> castResults(Class<T> type){
        List<T> filteredResults = new ArrayList<T>();
        for (SearchResult searchResult : this) {
            if(searchResult.getClass() == type){
                filteredResults.add((T) searchResult);
            }
        }
        return filteredResults;
    }
}
