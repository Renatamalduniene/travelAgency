package com.example.travelAgency.controllers;
import com.example.travelAgency.model.User;
import com.example.travelAgency.repository.UserRepository;
import com.example.travelAgency.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String showInitialScreen(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "index";
    }

    @GetMapping("/signup")
    public String showSignUpForm(User user) {
        return "user-add"; //html failo pavadinimas
    }

    @PostMapping("/adduser")
    public String addUser(User user, BindingResult result, Model model) {
        userRepository.save(user);
        model.addAttribute("users", userRepository.findAll());
        return "user-add";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        User user = userRepository.findById(id).orElseThrow(()
                -> new IllegalArgumentException("Invalid user id: " + id));

        userRepository.delete(user);
        model.addAttribute("users", userRepository.findAll());
        return "index";
    }

   /* @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException());
        model.addAttribute("user", user);
        return "user-edit";
    }*/

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id, Model model, User user, BindingResult result) {
        userRepository.save(user);
        model.addAttribute("users", userRepository.findAll());
        return "index";
    }
}
