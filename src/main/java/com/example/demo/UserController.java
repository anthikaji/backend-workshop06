package com.example.demo;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping ("/users")
    public UserResponse[] getAllUser(){
        UserResponse[] userResponses = new UserResponse[2];
        userResponses[0] = new UserResponse(1, "User1");
        userResponses[1] = new UserResponse(2, "User2");
        return  userResponses;
    }
}
