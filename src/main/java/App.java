package src.main.java;

import src.main.java.models.Movie;
import src.main.java.models.User;
import src.main.java.services.MovieService;
import src.main.java.services.UserService;

public class App {
    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        UserService userService = new UserService();

        User admin = new User("Alice", "Admin");
        User member = new User("Bob", "Member");

        if (userService.isAdmin(admin)) {
            movieService.addMovie(new Movie("Inception", "Christopher Nolan", 2010));
            movieService.addMovie(new Movie("Interstellar", "Christopher Nolan", 2014));
        }

        System.out.println("Movies available:");
        for (Movie movie : movieService.getMovies()) {
            System.out.println(movie);
        }
    }
}
