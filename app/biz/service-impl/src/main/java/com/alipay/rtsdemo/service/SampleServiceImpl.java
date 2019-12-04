package com.alipay.rtsdemo.service;

import com.alipay.rtsdemo.facade.SampleService;
import com.alipay.rtsdemo.facade.domain.User;

public class SampleServiceImpl implements SampleService {

    @Override
    public String message() {
        return "Hello, Service SOFABoot web";
    }

    @Override
    public User getUser() {
        return new User("lisi", 22, message());
    }

    @Override
    public User getUserById(int id) {
        return new User("wangwu", id, message());
    }

    @Override
    public User createUserByName(String name) {
        return new User(name, 12, message());
    }

}
