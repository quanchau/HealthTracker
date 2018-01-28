package com.example.bom.healthtracker;

/**
 * Created by Bom on 1/28/2018.
 */

public class User {

    public String email;
    public String password;
    public int age;
    public String name;


    public User(String email, String password, String name, int age) {
        this.password = password;
        this.email = email;
        this.name = name;
        this.age = age;
    }

}