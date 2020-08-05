package com.example.demo;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    public PagingResponse getAllUser(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(name = "item_per_page", defaultValue = "10") int itemPerPage) {

        PagingResponse pagingResponse = new PagingResponse(page, itemPerPage);
        List<UserResponse> usersResponseList = new ArrayList<>();
        usersResponseList.add(new UserResponse(1, "User 1"));
        usersResponseList.add(new UserResponse(2, "User 2"));
        usersResponseList.add(new UserResponse(3, "User 3"));
        pagingResponse.setUsersResponse(usersResponseList);
        return pagingResponse;
    }

    @GetMapping("/users/{id}")
    public UserResponse getUserById(@PathVariable int id) {
        return new UserResponse(id, "User " + id);
    }
}