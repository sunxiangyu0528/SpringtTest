package com.example.springttest;

import com.example.springttest.Entrity.UserInfoEntity;
import com.example.springttest.Mapper.UserInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringtTestApplicationTests {
    @Autowired
    UserInfoMapper userInfoMapper;

    @Test
    void query() {
        List<UserInfoEntity> userInfoEntities = userInfoMapper.selectList(null);
        System.out.println(userInfoEntities);
    }

}
