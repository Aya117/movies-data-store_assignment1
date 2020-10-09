package edu.cs.birzeit.moviesdatastore.model;

public class MoviesFactor {
    public IMoviesDA getModel(){
        return new MoviesDA();
    }

}
