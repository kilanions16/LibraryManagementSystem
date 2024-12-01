
import org.junit.jupiter.api.Test;
import services.MovieService;
import models.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    @Test
    void testAddMovie() {
        MovieService movieService = new MovieService();
        Movie movie = new Movie("Inception", "Christopher Nolan", 2010);

        movieService.addMovie(movie);

        assertEquals(1, movieService.getMovies().size());
        assertEquals("Inception", movieService.getMovies().get(0).getTitle());
    }

    @Test
    void testSearchMovie() {
        MovieService movieService = new MovieService();
        Movie movie = new Movie("Inception", "Christopher Nolan", 2010);
        movieService.addMovie(movie);

        Movie result = movieService.searchMovie("Inception");

        assertNotNull(result);
        assertEquals("Christopher Nolan", result.getDirector());
    }

    @Test
    void testRemoveMovie() {
        MovieService movieService = new MovieService();
        Movie movie = new Movie("Inception", "Christopher Nolan", 2010);
        movieService.addMovie(movie);

        movieService.removeMovie("Inception");

        assertEquals(0, movieService.getMovies().size());
    }
}

