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
}
