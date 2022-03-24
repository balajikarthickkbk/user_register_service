package com.project.userservice.userservice.controller;

import com.project.userservice.userservice.entity.User;
import com.project.userservice.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    private User saveUser(@RequestBody User user) {
        log.info("Saving User Records into System..{}", user);
        return userService.saveUser(user);
    }

    @GetMapping("/{surName}")
    private User findUserBySurName(@PathVariable("surName") String surName) {
        log.info("Finding User Details by SurName..{}", surName);
        User userDetails = userService.findUserBySurName(surName);
        log.info("The User details matching requested surname is...{}", userDetails);
        return userDetails;
    }
}
