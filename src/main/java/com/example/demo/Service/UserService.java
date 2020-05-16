package com.example.demo.Service;

public interface UserService {


    //method to add a person as a new User on the database
    void addUser(long id ,String name,String surname);

    //method to remove a person as a User on the database
    void removeUser(long id);

    //method to search for a person on the database
    String getUser(long id);
}
