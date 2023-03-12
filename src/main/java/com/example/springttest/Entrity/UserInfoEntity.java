package com.example.springttest.Entrity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("user_info")
public class UserInfoEntity implements Serializable {
    @TableField("id")
    private Integer id;
    @TableField("email")
    private String email;
}
