package at.ac.fhcampuswien.fhmdb.models;
import at.ac.fhcampuswien.fhmdb.models.Movie;
import at.ac.fhcampuswien.fhmdb.models.SortedState;

import java.util.List;

public interface ISortedState {
    void sortMovies(List<Movie> movies);
    ISortedState nextState();
}
