package com.example.demo.Model;

public class User {

//User's attributes or fields or variables
    private long Id;
    private String name;
    private String surname;

// constructor with arguments that are fields
    public User(long id, String name, String surname) {
        Id = id;
        this.name = name;
        this.surname = surname;
    }

// Default constructor
    public User(){

    }

// we creating getters and setters for our created fields
    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



}