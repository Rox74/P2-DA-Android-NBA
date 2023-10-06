package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser V

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // TODO: A modifier V
        // return null;
        return apiService.getUsers(); // Retrieve the list of users from the API
    }

    public void generateRandomUser() {
        // TODO: A modifier V
        apiService.generateRandomUser(); // Call the random user generation method in the API
    }

    public void deleteUser(User user) {
        // TODO: A modifier V
        apiService.deleteUser(user); // Call the user deletion method in the API
    }
}
