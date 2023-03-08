package com.example.springttest.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Autowired()
//    @Qualifier(value = "A")
    @Resource(name = "A")
    UserServiceImpl userService;
}
