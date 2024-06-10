package at.ac.fhcampuswien.fhmdb.StatePattern;
import at.ac.fhcampuswien.fhmdb.models.ISortedState;
import at.ac.fhcampuswien.fhmdb.models.Movie;
import at.ac.fhcampuswien.fhmdb.models.ISortedState;

import java.util.Comparator;
import java.util.List;
public class AscendingState implements ISortedState {
    @Override
    public void sortMovies(List<Movie> movies) {
        movies.sort(Comparator.comparing(Movie::getTitle));
    }

    @Override
    public ISortedState nextState() {
        return new DescendingState();
    }
}
