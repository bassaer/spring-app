package com.github.bassaer.springapp.controllers;


import com.github.bassaer.springapp.models.User;
import com.github.bassaer.springapp.models.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping
    public String index() {
        return "OK";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> findAll() {
        return userRepository.findAll();
    }

}
