package com.example.springttest.Control;

import com.example.springttest.Entrity.UserInfoEntity;
import com.example.springttest.Mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoControl {
    @Autowired
    UserInfoMapper userInfoMapper;

    @GetMapping("/query1")
    public List<UserInfoEntity> query() {
        System.out.println("Test");
        return userInfoMapper.selectList(null);
    }
}
