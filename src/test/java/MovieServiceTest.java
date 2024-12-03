package src.test.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import src.main.java.services.MovieService;
import src.main.java.models.Movie;

class MovieServiceTest {

    @Test
    void testAddMovie() {
        MovieService movieService = new MovieService();
        Movie movie = new Movie("Inception", "Christopher Nolan", 2010);

        movieService.addMovie(movie);

        // Vérification du nombre de films après ajout
        assertEquals(1, movieService.getMovies().size());
        // Vérification du titre du premier film
        assertEquals("Inception", movieService.getMovies().get(0).getTitle());
    }

    @Test
    void testSearchMovie() {
        MovieService movieService = new MovieService();
        Movie movie = new Movie("Inception", "Christopher Nolan", 2010);
        movieService.addMovie(movie);

        Movie result = movieService.searchMovie("Inception");

        // Vérification que le film existe
        assertNotNull(result);
        // Vérification du réalisateur du film trouvé
        assertEquals("Christopher Nolan", result.getDirector());
    }

    @Test
    void testRemoveMovie() {
        MovieService movieService = new MovieService();
        Movie movie = new Movie("Inception", "Christopher Nolan", 2010);
        movieService.addMovie(movie);

        movieService.removeMovie("Inception");

        // Vérification que la liste est vide après suppression
        assertEquals(0, movieService.getMovies().size());
    }
}