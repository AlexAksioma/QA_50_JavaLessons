package lesson12;

import java.util.Comparator;

public class MovieComparatorByNameRating implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
        int result = m1.getName().compareToIgnoreCase(m2.getName());
        if(result != 0)
            return result;
        return Double.compare(m1.getRating(), m2.getRating());
    }
}
