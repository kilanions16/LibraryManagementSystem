
Movie.java
package models;

public class Movie {
    private String title;
    private String director;
    private int year;

    public Movie(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie{" +
               "title='" + title + '\'' +
               ", director='" + director + '\'' +
               ", year=" + year +
               '}';
    }
}

User.java
Représente un utilisateur (Admin ou Membre).
java
Copier le code
package models;

public class User {
    private String name;
    private String role; // "Admin" ou "Member"

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}


