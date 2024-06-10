package at.ac.fhcampuswien.fhmdb.StatePattern;
import at.ac.fhcampuswien.fhmdb.models.ISortedState;
import at.ac.fhcampuswien.fhmdb.models.Movie;
import at.ac.fhcampuswien.fhmdb.models.SortedState;

import java.util.List;

public class NoneState implements ISortedState {
    @Override
    public void sortMovies(List<Movie> movies) {
        // No sorting needed for NoneState
    }

    @Override
    public ISortedState nextState() {
        return new AscendingState();
    }
}
