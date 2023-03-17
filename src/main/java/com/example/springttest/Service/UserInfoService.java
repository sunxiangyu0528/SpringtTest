package com.example.springttest.Service;

import com.example.springttest.Entrity.UserInfoEntity;
import com.example.springttest.Mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserInfoService {
        List<UserInfoEntity> queryUserInfo();

        UserInfoEntity getById(Integer id);

        UserInfoEntity getByName(String name);
}
