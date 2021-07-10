package com.company;

import java.util.ArrayList;
import java.util.List;

public class User {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, int id) {
        this.name = name;
        this.id = id;


    }
    public static User createUser(int id, String name) {
        return new User(name, id);
}}
