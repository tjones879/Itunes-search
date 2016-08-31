package me.tdjones.main.parameter;

public class Limit implements Parameter{
    private int limit;
    private static final int maxResults = 200;
    private static final int minResults = 1;

    public Limit(int limit){
        this.limit = validateLimit(limit);
    }

    private int validateLimit(int limit){
        if (limit > maxResults){
            limit = maxResults;
        } else if (limit < minResults){
            limit = minResults;
        }
        return limit;
    }

    public String createParameter(){
        return "limit=" + limit;
    }
}
