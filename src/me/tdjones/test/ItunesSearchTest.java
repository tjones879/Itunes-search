package me.tdjones.test;

import junit.framework.TestCase;
import me.tdjones.main.ItunesSearch;

import me.tdjones.main.parameter.*;
import me.tdjones.main.result.SearchResult;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ItunesSearchTest{
    private ItunesSearch itunesSearch;

    @Before
    public void setUp() throws Exception{
        this.itunesSearch = new ItunesSearch();
        itunesSearch.addParameter(new Limit(5));
        itunesSearch.addEntity(Entity.Movie.MOVIE);
        itunesSearch.addAttribute(Attribute.Movie.ACTOR);
        itunesSearch.setSearchTerm("Chris Pratt");
    }

    @Test
    public void search() throws Exception {
        assertNotNull(itunesSearch.search());
    }
}
