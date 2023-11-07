package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService;

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        return apiService.getUsers(); // Retrieve the list of users from the API
    }

    public void generateRandomUser() {
        apiService.generateRandomUser(); // Call the random user generation method in the API
    }

    public void deleteUser(User user) {
        apiService.deleteUser(user); // Call the user deletion method in the API
    }
}
