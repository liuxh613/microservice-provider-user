package com.lxh.cloud.study.service.impl;

import com.lxh.cloud.study.mapper.UserMapper;
import com.lxh.cloud.study.model.User;
import com.lxh.cloud.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Long id) {
        System.out.println("find user:"+id);
        return userMapper.getUserById(id);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userMapper.save(user);
    }
}
