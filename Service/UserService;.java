package services;

import models.User;

public class UserService {
    public boolean isAdmin(User user) {
        return "Admin".equalsIgnoreCase(user.getRole());
    }
}

