/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.rtsdemo.junit.test.usercases;

import com.alipay.rtsdemo.facade.domain.User;
import com.alipay.rtsdemo.service.SampleServiceImpl;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author zhudan
 * @version UserServiceTest: UserServiceTest.java, v 0.1 2019年12月03日 19:12 zhudan Exp $
 */
public class UserServiceTest {

    private SampleServiceImpl sampleService = new SampleServiceImpl();

    @Test
    public void testGetUser() {
        User user = sampleService.getUser();
        Assert.assertEquals("lisi", user.getName());
    }

    @Test
    public void testGetUserById(){
        int id = 23;
        User user = sampleService.getUserById(id);
        Assert.assertEquals(id, user.getId());
    }

    @Test
    public void testCreateUserByName(){
        String name = "Eric";
        User user = sampleService.createUserByName(name);
        Assert.assertEquals(name, user.getName());
    }

}