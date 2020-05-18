package com.github.bassaer.springapp.controllers;


import com.github.bassaer.springapp.models.User;
import com.github.bassaer.springapp.models.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping
    public String index() {
        return "OK";
    }

    @GetMapping("/table")
    public String table(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "table";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> findAll() {
        return userRepository.findAll();
    }

}
