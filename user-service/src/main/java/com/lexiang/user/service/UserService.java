package com.lexiang.user.service;


import com.lexiang.user.mapper.UserMapper;
import com.lexiang.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Random;
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    public User queryById(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
