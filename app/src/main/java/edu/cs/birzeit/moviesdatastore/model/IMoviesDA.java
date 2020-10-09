package edu.cs.birzeit.moviesdatastore.model;

import java.util.List;

public interface IMoviesDA {
    List <movies> getMovies (String gen);
    List <movies> getMovie (String com);
    List <movies> getmov(String tit);
    String[]getgen();
    String[]getcom();
    String[]gettit();
}
