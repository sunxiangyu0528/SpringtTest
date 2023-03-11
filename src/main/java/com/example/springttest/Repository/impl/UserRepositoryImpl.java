package com.example.springttest.Repository.impl;

import com.example.springttest.Entrity.UserEntity;
import com.example.springttest.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    List<UserEntity> userEntities = new ArrayList<>();
    UserEntity userEntity = new UserEntity();

    public void UserRepositoryImpl(){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1);
        userEntity.setName("sxy");
        this.userEntities.add(userEntity);

        userEntity = new UserEntity();
        userEntity.setId(2);
        userEntity.setName("zll");
        this.userEntities.add(userEntity);

        userEntity = new UserEntity();
        userEntity.setId(3);
        userEntity.setName("lgg");
        this.userEntities.add(userEntity);

    }

    @Override
    public List<UserEntity> query() {
        System.out.println(userEntities);
        return userEntities;
    }

}
