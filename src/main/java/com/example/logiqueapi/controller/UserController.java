package com.example.logiqueapi.controller;

import com.example.logiqueapi.model.UserModel;
import com.example.logiqueapi.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserRepository userR;

    @PostMapping("/create")
    public UserModel userM(@RequestBody UserModel userM) {
        return this.userR.save(userM);
    }

    @GetMapping("/list")
    public UserModel userM(@PathVariable("name")String name) {
        return this.userR.findByName(name);
    }

}