package utils;

import com.google.gson.JsonSyntaxException;
import me.tdjones.main.result.SearchResult;
import me.tdjones.main.result.SearchResultList;
import me.tdjones.main.utils.JSONUtil;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;

public class JSONUtilTest {
    private static String resourceDir = "../resources/";

    public static File getResourceFile(String fileName) throws Exception {
        URL resourceURL = JSONUtilTest.class.getResource(resourceDir + fileName);
        File file = new File(resourceURL.toURI());
        return file;
    }

    public static SearchResultList trimParseJson(Scanner scanner){
        String json = scanner.useDelimiter("\\A").next().trim();
        return JSONUtil.parseJSON(json);
    }

    @Test
    public void testValidParse() throws Exception{
        try(Scanner scanner = new Scanner(getResourceFile("trackJson.txt"))){
            SearchResultList searchResultList = trimParseJson(scanner);

            assertNotNull(searchResultList.get(0));
            assertNotNull(searchResultList.get(1));
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testEmptyParse() throws Exception{
        try(Scanner scanner = new Scanner(getResourceFile("emptyJson.txt"))){
            assertTrue(trimParseJson(scanner).isEmpty());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    @Test(expected = JsonSyntaxException.class)
    public void testJsonSyntaxException() throws Exception{
        try(Scanner scanner = new Scanner(getResourceFile("malformedJson.txt"))){
            trimParseJson(scanner);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
