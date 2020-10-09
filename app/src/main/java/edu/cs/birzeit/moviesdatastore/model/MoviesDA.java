package edu.cs.birzeit.moviesdatastore.model;

import java.util.ArrayList;
import java.util.List;

public class MoviesDA implements IMoviesDA{
    private ArrayList <movies> Movie = new ArrayList<>();

    public MoviesDA (){
        Movie.add(new movies("Ready or not ","2019","horror"));
        Movie.add(new movies("dadys home 2","2017","comedy"));
        Movie.add(new movies("black swan ","2010","drama"));
        Movie.add(new movies("To All the Boys","2020","romantic"));
        Movie.add(new movies("the lovebirds","2018","romantic"));
        Movie.add(new movies("all the bright","2018","romantic "));
        Movie.add(new movies("deliver us from evil","2014","horrer"));
        Movie.add(new movies("housebound","2014","horror"));
        Movie.add(new movies("sister","2015","comedy"));
        Movie.add(new movies("blockers","2015","comidy"));
        Movie.add(new movies("creed","2016","drama"));
        Movie.add(new movies("lala land","2016","drama"));
    }

    public List<movies> getMovies(String gen){
        ArrayList<movies> data = new ArrayList<>();
        for (movies M : Movie){
            if(M.getGenre().equals(gen)){
                data.add(M);
            }
        }
        return  data;
    }
    public List<movies> getMovie(String com){
        ArrayList<movies> data1 = new ArrayList<>();
        for (movies M : Movie) {
            if (M.getYear().equals(com)) {
                data1.add(M);
            }
        }
        return data1;
    }
    public List<movies> getmov(String tit){
        ArrayList<movies> data2 = new ArrayList<>();
        for (movies M : Movie) {
            if (M.getTitle().equals(tit)) {
                data2.add(M);
            }
        }
        return data2;
    }

   public String[] getgen(){
        String[] gen = new String[]{"horror","comedy","drama","romantic"};
        return  gen;
   }


   public  String[] getcom(){
        String [] com = new String[]{"2014","2015","2016","2017","2018","2019","2020"};
        return  com;
   }
    public  String[] gettit(){
        String [] tit = new String[]{"Ready or not","dadys home 2","black swan ",
                "To All the Boys","the lovebirds","all the bright","deliver us from evil",
                "housebound","sister","blockers","creed","lala land"};

        return  tit;
    }

}
