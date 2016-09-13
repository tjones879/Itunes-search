package utils;

import me.tdjones.main.result.SearchResult;
import me.tdjones.main.utils.JSONUtil;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertNotNull;

public class JSONUtilTest {


    @Test
    public void shouldParseTrack() throws Exception{
        URL resourceDir = JSONUtilTest.class.getResource("../resources/songJson.txt");
        File file = new File(resourceDir.toURI());
        try(Scanner scanner = new Scanner(file)){
            String json = scanner.useDelimiter("\\Z").next().trim();
            List<SearchResult> searchResultList = JSONUtil.parseJSON(json);
            assertNotNull(searchResultList);
            assertNotNull(searchResultList.get(0));
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
