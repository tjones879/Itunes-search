package me.tdjones.test;

import junit.framework.TestCase;
import me.tdjones.main.ItunesSearch;

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

    }

    @Test
    public void addParameter() throws Exception {
    }

}
