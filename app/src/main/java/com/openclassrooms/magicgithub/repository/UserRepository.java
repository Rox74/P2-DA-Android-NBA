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
        return apiService.getUsers(); // Obtenir la liste des utilisateurs depuis l'API
    }

    public void generateRandomUser() {
        // TODO: A modifier V
        apiService.generateRandomUser(); // Appeler la méthode de génération d'utilisateur aléatoire dans l'API
    }

    public void deleteUser(User user) {
        // TODO: A modifier V
        apiService.deleteUser(user); // Appeler la méthode de suppression d'utilisateur dans l'API
    }
}
