package com.lexiang.consumer.service;

import com.lexiang.consumer.mapper.ConsumerMapper;
import com.lexiang.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConumerService {
    @Autowired
    private ConsumerMapper consumerMapper;


    public List<User> queryUserByIds(List<Long> ids) {
        ArrayList<User> users = new ArrayList<>();
        for (Long id : ids) {
            User user = this.consumerMapper.queryByUserId(id);
            users.add(user);
        }
        return users;
    }
}
