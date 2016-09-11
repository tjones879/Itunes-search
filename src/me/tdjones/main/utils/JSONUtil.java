package me.tdjones.main.utils;

import me.tdjones.main.results.SearchResult;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.File;
import java.util.List;

public class JSONUtil {
    public static List<SearchResult> parseJSON(String string) throws JAXBException{
        JAXBContext jc = JAXBContext.newInstance(SearchResult.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        unmarshaller.setProperty();
        return null;
    }


}
