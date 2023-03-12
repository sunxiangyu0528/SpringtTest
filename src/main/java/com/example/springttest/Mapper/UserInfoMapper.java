package com.example.springttest.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springttest.Entrity.UserInfoEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfoEntity> {
}
