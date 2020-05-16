package com.example.demo.Dao;
import com.example.demo.Model.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

//annotation to show that this is a repository class
@Repository
public class FakeRepo implements FakeRepoInterface  {


    private static List<User> database = new ArrayList<>();

//methods overridden from the FakeRepoInterface Interface
    @Override
    public void insertUser(long id, String name, String surname) {
        database.add(new User(id, name, surname));
        System.out.println(name + " entered");

    }

    @Override
    public String findUserById(long id) {
        database.get((int) id);

        return null;
    }

    @Override
    public void deleteUser(long id) {
        database.remove(id);
    }
}
