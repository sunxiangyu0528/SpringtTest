package com.example.springttest.Control;

import com.example.springttest.Entrity.UserInfoEntity;
import com.example.springttest.Mapper.UserInfoMapper;
import com.example.springttest.Service.iml.UserInfoServiceIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping("/")
@RestController
public class UserInfoControl {
    @Autowired
    UserInfoServiceIml userInfoServiceIml;

//    @GetMapping("/query1")
//    public List<UserInfoEntity> query() {
//        System.out.println("Test");
//        return userInfoMapper.selectList(null);
//    }

    @GetMapping("/query2")
    public List<UserInfoEntity> query2() {
        return userInfoServiceIml.queryUserInfo();
    }

    @GetMapping("/get/{userId}")
    @ResponseBody
    public UserInfoEntity getById(@PathVariable("userId") Integer userId) {

        return userInfoServiceIml.getById(userId);
    }

    @GetMapping("/get")
    public UserInfoEntity getById2(@PathParam(value = "id") Integer id) {

        return userInfoServiceIml.getById(id);
    }
}
