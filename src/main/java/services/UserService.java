package src.main.java.services;

import src.main.java.models.User;

public class UserService {
    public boolean isAdmin(User user) {
        return "Admin".equalsIgnoreCase(user.getRole());
    }
}

