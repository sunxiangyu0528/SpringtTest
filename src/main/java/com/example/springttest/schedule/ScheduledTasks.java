package com.example.springttest.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
    @Scheduled(fixedRate = 5000)
    public void hello(){

        System.out.println("hello world!");
    }
}
