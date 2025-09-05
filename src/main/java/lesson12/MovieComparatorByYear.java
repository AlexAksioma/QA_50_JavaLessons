package lesson12;

import java.util.Comparator;

public class MovieComparatorByYear implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) { //m1.compareTo(m2)
        return m1.getYear() - m2.getYear();
        //return Integer.compare(m1.getYear(), m2.getYear());
    }

}
