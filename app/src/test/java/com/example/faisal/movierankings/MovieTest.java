package com.example.faisal.movierankings;

import org.junit.Before;
import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by Faisal on 03/07/2017.
 */

public class MovieTest {

    private Movie movie;

    @Before
    public void before() {
        movie = new Movie ("the godfather", "drama", 1);
    }

    @Test
    public void hasTitle() {
        assertEquals("the godfather", movie.getTitle());
    }

    @Test
    public void canSetTitle() {
        assertEquals("inception", movie.setTitle("inception"));
    }

    @Test
    public void hasGenre() {
        assertEquals("drama", movie.getGenre());
    }

    @Test
    public void canSetGenre() {
        assertEquals("action", movie.setGenre("action"));
    }

    @Test
    public void hasRanking() {
        assertEquals(1, movie.getRanking());
    }

    @Test
    public void canSetRanking() {
        assertEquals(5, movie.setRanking(5));
    }

//    @Test
//    public void movieDetails() {
//        assertEquals("the godfather, drama, 1", movie.movieDetails());
//    }





}
