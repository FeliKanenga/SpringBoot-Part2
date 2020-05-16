package com.example.demo.Dao;

public interface FakeRepoInterface {

    //method to insert people's information
    void insertUser(long id,String name,String surname);

    //method to find people's information by ID
    String findUserById(long id);

    //method to delete people's information
    void deleteUser(long id);


}
