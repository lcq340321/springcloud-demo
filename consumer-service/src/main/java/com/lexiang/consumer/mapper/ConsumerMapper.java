package com.lexiang.consumer.mapper;

import com.lexiang.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class ConsumerMapper {

    @Autowired
    private RestTemplate restTemplate;


    public User queryByUserId(Long id) {
        String url = "http://localhost:8200/user/" + id;
        return this.restTemplate.getForObject(url,User.class);
    }
}
