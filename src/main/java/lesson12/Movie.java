package lesson12;

import java.util.Objects;

public class Movie implements Comparable<Movie>{
    private String name;
    private double rating;
    private int year;

    public Movie() {
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override  //movie.equals(movie1)
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return year == movie.year && Objects.equals(name, movie.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }

    @Override   //movie1.compareTo(movie2)
    public int compareTo(Movie another) {
        int result = name.compareTo(another.name);
        if(result != 0)
            return result;
        //result = another.year - year;
        result = Integer.compare(another.year, year);
        return result;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';
    }
}
