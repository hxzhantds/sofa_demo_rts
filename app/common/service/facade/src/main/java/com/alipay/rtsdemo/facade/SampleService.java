package com.alipay.rtsdemo.facade;

import com.alipay.rtsdemo.facade.domain.User;

public interface SampleService {

    String message();

    User getUser();

    User getUserById(int id);

    User createUserByName(String name);
}

