package com.example.springttest.Service;

import com.example.springttest.Entrity.UserEntity;
import com.example.springttest.Repository.UserRepository;
import com.example.springttest.Repository.impl.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    List<UserEntity> queryService();
}
