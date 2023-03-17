package com.example.springttest.Service.iml;

import com.example.springttest.Entrity.UserInfoEntity;
import com.example.springttest.Mapper.UserInfoMapper;
import com.example.springttest.Service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceIml implements UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;


    @Override
    public List<UserInfoEntity> queryUserInfo() {
        return userInfoMapper.selectList(null);
    }

    @Override
    public UserInfoEntity getById(Integer id) {
        return userInfoMapper.selectById(id);

    }

    @Override
    public UserInfoEntity getByName(String name) {
        return userInfoMapper.getByName(name);
    }

}
