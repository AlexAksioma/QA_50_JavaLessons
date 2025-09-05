package lesson12;

import java.util.Comparator;

public class MovieComparatorByRating implements Comparator<Movie> {

    @Override   //7.2   7.5   7.7
    public int compare(Movie m1, Movie m2) {
        return Double.compare(m2.getRating(), m1.getRating());
    }
}
