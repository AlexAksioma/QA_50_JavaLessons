package lesson12;

import java.util.Arrays;
import java.util.Comparator;

public class MovieComparatorMain {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Iron Man", 8.9, 2012);
        Movie movie2 = new Movie("The Incredible Hulk", 8.9, 2008);
        Movie movie3 = new Movie("Thor", 9.5, 2017);
        Movie movie6 = new Movie("Thor", 9.0, 1965);
        Movie movie4 = new Movie("Captain America", 7.9, 2011);
        Movie movie5 = new Movie("Guardians of the Galaxy", 9.9, 2014);
        Movie movie5_1 = new Movie("Guardians of the Galaxy 1", 5.5, 2014);
        Movie movie5_2 = new Movie("Guardians of the Galaxy 2", 5.5, 2014);

        Movie[] movies = {movie1, movie2, movie6, movie3, movie4, movie5, movie5_1, movie5_2};
        printMovies(movies);
        MovieComparatorByYear comparatorByYear = new MovieComparatorByYear();
        Arrays.sort(movies, comparatorByYear);
        System.out.println("==========================");
        printMovies(movies);
        Arrays.sort(movies, comparatorByYear.reversed());
        System.out.println("==========================");
        printMovies(movies);
        Arrays.sort(movies, new MovieComparatorByRating());
        System.out.println("==========================");
        printMovies(movies);
        MovieComparatorByNameRating movieComparatorByNameRating = new MovieComparatorByNameRating();
        Arrays.sort(movies, movieComparatorByNameRating);
        System.out.println("==========================");
        printMovies(movies);
        Arrays.sort(movies, new MovieComparatorAll());
        System.out.println("==========================");
        printMovies(movies);
        moviesSortingComparator(movies, comparatorByYear);
        System.out.println("==========================");
        printMovies(movies);
    }

    private static void printMovies(Movie[] movies) {
        if (movies != null && movies.length != 0)
            for (Movie m : movies){
                System.out.println(m);
            }
    }

    private static void moviesSortingComparator(Movie[] movies, Comparator<Movie> comparator){
        if(movies == null || movies.length == 0){
            System.err.println("array is null or empty");
            return;
        }
        for (Movie m : movies)
            if(m == null || m.getName() == null){
                System.err.println("element is null or element name is null");
                return;
            }
        Arrays.sort(movies, comparator);
    }
}
