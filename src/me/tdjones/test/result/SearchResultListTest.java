package result;

import me.tdjones.main.result.SearchResultList;
import me.tdjones.main.result.wrapper.Track;
import me.tdjones.main.utils.JSONUtil;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class SearchResultListTest {
    private static String resourceDir = "../resources/";

    public static File getResourceFile(String fileName) throws Exception {
        URL resourceURL = SearchResultListTest.class.getResource(resourceDir + fileName);
        File file = new File(resourceURL.toURI());
        return file;
    }

    public static SearchResultList trimParseJson(Scanner scanner){
        String json = scanner.useDelimiter("\\A").next().trim();
        return JSONUtil.parseJSON(json);
    }

    @Test
    public void testCastResults() throws Exception {
        try(Scanner scanner = new Scanner(getResourceFile("trackJson.txt"))){
            SearchResultList searchResultList = trimParseJson(scanner);
            assertEquals(2, searchResultList.castResults(Track.class).size());
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
