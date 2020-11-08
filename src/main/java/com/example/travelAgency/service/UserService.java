package com.example.travelAgency.service;

import com.example.travelAgency.model.Trip;
import com.example.travelAgency.model.User;
import com.example.travelAgency.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(User user) {
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }
}
