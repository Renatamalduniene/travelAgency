package com.example.travelAgency.controllers;
import com.example.travelAgency.model.User;
import com.example.travelAgency.repository.UserRepository;
import com.example.travelAgency.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return users;
    }
    @GetMapping("/")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    @PostMapping("/adduser")
    public String addUser(@RequestBody User user, Model model) {
        userRepository.save(user);
        model.addAttribute("users", userRepository.findAll());
        return "user added";
    }
    @DeleteMapping("/deleteuser")
    public String deleteUser(@RequestBody User user) {
        userRepository.delete(user);
        return "user deleted";
    }
    @PutMapping ("/edituser")
    public String editUser(@RequestBody User user) {
        userService.saveUser(user);
        return "user edited";
    }
}



