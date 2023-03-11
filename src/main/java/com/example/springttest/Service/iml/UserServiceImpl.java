package com.example.springttest.Service.iml;

import com.example.springttest.Entrity.UserEntity;
import com.example.springttest.Repository.impl.UserRepositoryImpl;
import com.example.springttest.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepositoryImpl userRepository;

    @Override
    public List<UserEntity> queryService() {
        return userRepository.query();
    }
}
