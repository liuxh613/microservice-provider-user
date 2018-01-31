package com.lxh.cloud.study.controller;

import com.lxh.cloud.study.model.User;
import com.lxh.cloud.study.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") String id){
        /*Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            UserDetails user = (UserDetails) principal;
            Collection<? extends GrantedAuthority> collection = user.getAuthorities();
            for (GrantedAuthority c:collection) {
                UserController.LOGGER.info("当前用户是{}，角色是{}",user.getUsername(),c.getAuthority());
            }
        }else {
        }*/
        User findOne =userService.getUserById(Long.valueOf(id));
        return findOne;
    }

    @GetMapping("/save")
    public String save(@RequestParam("uName") String userName, @RequestParam("na") String name, @RequestParam("ag") String age, @RequestParam("ba") String balance){
        User user = new User();
        user.setUserName(userName);
        user.setName(name);
        user.setAge(Integer.valueOf(age));
        user.setBalance(new BigDecimal(balance));
        userService.saveUser(user);
        return "save ok";
    }
}
