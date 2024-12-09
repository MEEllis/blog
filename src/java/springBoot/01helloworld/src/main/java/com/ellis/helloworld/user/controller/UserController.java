package com.ellis.helloworld.user.controller;

import com.ellis.helloworld.user.entity.User;
import com.ellis.helloworld.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ellis
 * @create 2024-11-28-下午4:27
 */
@RestController
@RequestMapping("admin/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/list")
    public  String list(){
        return userMapper.selectList(null).toString();
    }

    @GetMapping("/add")
    public  int add(){
        User user = new User();
        user.setName("test");
        user.setAge(12);
        user.setEmail("16418@qq.com");

        return userMapper.insert(user);
    }

    @GetMapping("/update")
    public  int update(){
        User user = new User();
        user.setId(6L);
        user.setName("testccc");
        user.setEmail("16418@qq.com");

        return userMapper.updateById(user);
    }
}
