package com.example.springttest.Service;

import org.springframework.stereotype.Component;

@Component(value = "B")
public class DemoServiceB implements UserServiceImpl {
    @Override
    public void sing() {

    }
}
