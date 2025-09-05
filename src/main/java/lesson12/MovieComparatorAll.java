package lesson12;

import java.util.Comparator;

public class MovieComparatorAll implements Comparator<Movie> {

    @Override  //year reverse --> rating --> name
    public int compare(Movie m1, Movie m2) {
        int result = Integer.compare(m2.getYear(), m1.getYear());
        if (result != 0)
            return result;
        result = Double.compare(m1.getRating(), m2.getRating());
        if (result != 0)
            return result;
        return m1.getName().compareTo(m2.getName());
    }
}
