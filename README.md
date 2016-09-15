# Itunes-search
Java API for searching Itunes

For example, to fetch a few movies with Chris Pratt as an actor:

```java
ItunesSearch itunesSearch = new ItunesSearch();
itunesSearch.addParameter(new Limit(3));
itunesSearch.setAttribute(Movie.ACTOR);
SearchResultList searchResults = itunesSearch.search();
```

To get the title of the first result:

```java
searchResults.get(0).getTitle();
```

To get all `Track` results for later use:

```java
List<Track> tracks = searchResults.castResults(Track.class);
```
