package com.lxh.cloud.study.mapper;

import com.lxh.cloud.study.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from User where id = #{id}")
    User getUserById(Long id);

    @Insert("insert into user(userName,name,age,balance) values (#{userName},#{name},#{age},#{balance})")
    void save(User user);

}
