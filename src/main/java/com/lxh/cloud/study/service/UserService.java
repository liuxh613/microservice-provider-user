package com.lxh.cloud.study.service;

import com.lxh.cloud.study.model.User;

public interface UserService {

   User getUserById(Long id);

   void saveUser(User user);
}
