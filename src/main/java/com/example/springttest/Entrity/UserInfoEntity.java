package com.example.springttest.Entrity;

import lombok.Data;

import java.io.Serializable;

@Data

public class UserInfoEntity implements Serializable {

    private Integer id;
    private String email;
}
