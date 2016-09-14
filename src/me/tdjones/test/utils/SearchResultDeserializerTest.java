package utils;

import me.tdjones.main.result.SearchResult;
import me.tdjones.main.result.wrapper.Artist;
import me.tdjones.main.result.wrapper.Collection;
import me.tdjones.main.result.wrapper.Track;
import me.tdjones.main.utils.JSONUtil;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class SearchResultDeserializerTest {
    private String resourceDir = "../resources/";

    private File getResourceFile(String fileName) throws Exception {
        URL resourceURL = SearchResultDeserializerTest.class.getResource(resourceDir + fileName);
        File file = new File(resourceURL.toURI());
        return file;
    }

    private List<SearchResult> trimParseJson(Scanner scanner){
        String json = scanner.useDelimiter("\\A").next().trim();
        return JSONUtil.parseJSON(json);
    }

    @Test
    public void testTrackParse() throws Exception{
        try(Scanner scanner = new Scanner(getResourceFile("trackJson.txt"))){
            List<SearchResult> searchResultList = trimParseJson(scanner);

            assertEquals(Track.class, searchResultList.get(0).getClass());
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testCollectionParse() throws Exception{
        try(Scanner scanner = new Scanner(getResourceFile("collectionJson.txt"))){
            List<SearchResult> searchResultList = trimParseJson(scanner);

            assertEquals(Collection.class, searchResultList.get(0).getClass());
        }
    }

    @Test
    public void testArtistParse() throws Exception {
        try(Scanner scanner = new Scanner(getResourceFile("artistJson.txt"))){
            List<SearchResult> searchResultList = trimParseJson(scanner);

            assertEquals(Artist.class, searchResultList.get(0).getClass());
        }
    }
}
