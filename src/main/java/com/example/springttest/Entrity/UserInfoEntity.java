package com.example.springttest.Entrity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class UserInfoEntity implements Serializable {
    private Integer id;
    private String email;
}
