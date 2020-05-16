package com.example.demo;
import com.example.demo.Model.User;
import com.example.demo.Service.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import java.net.URL;


class UserServiceImplTest {
    @Autowired
    public TestRestTemplate template;
    @Autowired
    public UserServiceImpl userService;
    @Autowired
    private User user;

    @Test
    void addUser() {

    }
    @Test
    void removeUser() {
        //Can't test a void function
    }

    @Test
    void getUser(){
        String name1 = userService.getUser(1);
        String name2 = userService.getUser(2);
        String name3 = userService.getUser(3);
        String name4 = userService.getUser(4);

        System.out.println(name1 + " " + name2 + " " + name3 + " " + name4);

    }
    private URL base;

    @BeforeEach
    public void urlLink()throws Exception{
        this.base = new URL(" ");
    }
    @Test
    //check your username and password if they work
    public void shouldAuthenticate()throws Exception{
        ResponseEntity<String> response = template.withBasicAuth(user.getName(),user.getName()).getForEntity(base.toString(),String.class);
    }
}