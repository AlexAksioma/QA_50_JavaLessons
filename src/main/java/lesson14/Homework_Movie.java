package lesson14;

import lesson12.Movie;

import java.util.ArrayList;
import java.util.List;

public class Homework_Movie {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Iron Man", 8.9, 2012);
        Movie movie2 = new Movie("The Incredible Hulk", 8.9, 2008);
        Movie movie3 = new Movie("Thor", 9.5, 2017);
        Movie movie3_1 = new Movie("Thor", 9.5, 2017);
        Movie movie6 = new Movie("Thor", 9.5, 1965);
        Movie movie4 = new Movie("Captain America", 7.9, 2011);
        Movie movie5 = new Movie("Guardians of the Galaxy", 9.9, 2014);
        Movie movie5_1 = new Movie("Guardians of the Galaxy", 5.5, 2014);
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie3_1);
        movies.add(movie6);
        movies.add(movie4);
        movies.add(movie5_1);
        movies.add(movie5);
        System.out.println(movies);
        List<Movie> list1 = deleteRepetitiveMovie(movies);
        System.out.println(list1);
    }

    static List<Movie> deleteRepetitiveMovie(List<Movie> list){
        if(list == null || list.isEmpty())
            return null;
        List<Movie> result = new ArrayList<>();
        for (Movie m : list){
            if(!result.contains(m)) // result.contains(m) == false
                result.add(m);
        }
        return result;
    }
}
