package me.tdjones.test;

import junit.framework.TestCase;
import me.tdjones.main.ItunesSearch;

import me.tdjones.main.parameter.Media;
import me.tdjones.main.parameter.attributes.Movie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


import java.util.ArrayList;

@RunWith(JUnit4.class)
public class ItunesSearchTest extends TestCase{
    private ItunesSearch itunesSearch;

    @Override
    protected void setUp() throws Exception{
        super.setUp();
        this.itunesSearch = new ItunesSearch();
    }

    @Test
    public void search() throws Exception {
        assertEquals(1,1);
    }

    @Test
    public void addParameter() throws Exception {
        itunesSearch.addParameter();
    }

    @Test
    public void setEntity() throws Exception {
        itunesSearch.setEntity();
    }

    @Test
    public void setAttribute() throws Exception {
        itunesSearch.setAttribute(Movie.ACTOR);
    }

}
