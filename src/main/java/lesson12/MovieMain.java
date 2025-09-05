package lesson12;

import java.util.Arrays;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Iron Man", 8.9, 2012);
        Movie movie2 = new Movie("The Incredible Hulk", 8.9, 2008);
        Movie movie3 = new Movie("Thor", 9.5, 2017);
        Movie movie6 = new Movie("Thor", 9.5, 1965);
        Movie movie4 = new Movie("Captain America", 7.9, 2011);
        Movie movie5 = new Movie("Guardians of the Galaxy", 9.9, 2014);
        Movie movie5_1 = new Movie("Guardians of the Galaxy", 5.5, 2014);

        Movie[] movies = {movie1, movie2, movie6, movie3, movie4, movie5};
        Movie[] movies1 = {movie1, null, movie2, movie6, movie3, movie4, movie5};
        printMovies(movies);
        Arrays.sort(movies);
        System.out.println("=================================");
        printMovies(movies);
        System.out.println("==================================");
        System.out.println(movie5.equals(movie5_1));
        System.out.println(movie5.compareTo(movie5_1));

        moviesSorting(movies1);
        printMovies(movies1);
        System.out.println("=====================================");
        System.out.println(movie5.hashCode()+":"+movie5_1.hashCode());
        System.out.println(movie5.hashCode()+":"+movie4.hashCode());
        System.out.println(movie5_1.equals(movie5));
    }

    private static void printMovies(Movie[] movies) {
        if (movies != null && movies.length != 0)
            for (Movie m : movies){
                System.out.println(m);
            }
    }

    private static void moviesSorting(Movie[] movies){
        if(movies == null || movies.length == 0){
            System.err.println("array is null or empty");
            return;
        }
        for (Movie m : movies)
            if(m == null || m.getName() == null){
                System.err.println("element is null or element name is null");
                return;
            }
        Arrays.sort(movies);
    }
}
