package com.example.springttest.Control;

import com.example.springttest.Entrity.UserEntity;
import com.example.springttest.Service.iml.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class UserTestControl {
    @Autowired
    UserServiceImpl userService;

    @GetMapping("/list")
    public List<UserEntity> query() {

        return userService.queryService();

    }
}
