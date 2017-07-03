package com.example.faisal.movierankings;

/**
 * Created by Faisal on 03/07/2017.
 */

public class Movie {

    private String title;
    private String genre;
    private int ranking;

    public Movie(String title, String genre, int ranking) {
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String getTitle() {
        return this.title;
    }

    public String setTitle(String title) {
        return this.title = title;
    }

    public String getGenre() {
        return this.genre;
    }

    public String setGenre(String genre) {
        return this.genre = genre;
    }

    public int getRanking() {
        return this.ranking;
    }

    public int setRanking(int ranking) {
        return this.ranking = ranking;
    }

//    public String movieDetails() {
//        Movie example = new Movie("the godfather", "drama", 1);
//        return System.out.println(example);
//    }


}
