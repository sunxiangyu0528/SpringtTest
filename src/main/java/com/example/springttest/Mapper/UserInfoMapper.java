package com.example.springttest.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springttest.Entrity.UserInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfoEntity> {

    @Select("select * from  user_info  where name_en = #{name_en}")
    UserInfoEntity getByName(String name_en);
}
