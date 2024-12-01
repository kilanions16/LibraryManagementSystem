package models;

public class User {
    private String name;
    private String role; // "Admin" or "Member"

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
