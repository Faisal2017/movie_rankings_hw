package com.example.faisal.movierankings;

import org.junit.Before;
import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by Faisal on 03/07/2017.
 */

public class RankingTest {

    Ranking movieRankings;

    @Before
    public void before() {
        movieRankings = new Ranking();
    }

    @Test
    public void hasBeenCreated() {
        movieRankings.setUp();
        assertEquals(1, movieRankings.numMovies());
    }

}
