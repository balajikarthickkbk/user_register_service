package com.project.userservice.userservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userID;

    private String firstName;

    private String surName;

    private String emailAddress;

    public User(String firstName, String surName, String emailAddress) {
        this.firstName = firstName;
        this.surName = surName;
        this.emailAddress = emailAddress;
    }
}
