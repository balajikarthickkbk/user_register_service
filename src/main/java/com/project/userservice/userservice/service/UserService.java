package com.project.userservice.userservice.service;

import com.project.userservice.userservice.entity.User;
import com.project.userservice.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User saveUser(User user) {
        return repository.save(user);
    }

    public User findUserBySurName(String surName) {
        return repository.findUserBySurName(surName);
    }
}

