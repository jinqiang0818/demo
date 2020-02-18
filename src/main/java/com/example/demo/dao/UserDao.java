package com.example.demo.dao;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

//@Mapper
public interface UserDao {

    @Select("select * from user u where u.id = #{id}")
    Map<String, Object> selectUserById(@Param("id") int id);

    @Select("select * from user u where u.id = #{id}")
    User selectUserById2(@Param("id") int id);
}
