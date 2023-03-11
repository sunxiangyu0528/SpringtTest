package com.example.springttest.Repository;

import com.example.springttest.Entrity.UserEntity;

import java.util.List;

public interface UserRepository {
    List<UserEntity> query();
}
