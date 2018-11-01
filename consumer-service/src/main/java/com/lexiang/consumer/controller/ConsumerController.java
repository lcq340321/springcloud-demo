package com.lexiang.consumer.controller;

import com.lexiang.consumer.pojo.User;
import com.lexiang.consumer.service.ConumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("consumer")
public class ConsumerController {
    @Autowired
    private ConumerService conumerService;
    @GetMapping
    public List<User>  consume(@RequestParam("ids")List<Long> ids){

        return this.conumerService.queryUserByIds(ids);

    }
}
