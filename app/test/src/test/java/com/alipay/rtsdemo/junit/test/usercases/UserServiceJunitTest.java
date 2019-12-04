/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.rtsdemo.junit.test.usercases;

import com.alipay.rtsdemo.service.SampleServiceImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author zhudan
 * @version UserServiceJunitTest: UserServiceJunitTest.java, v 0.1 2019年12月04日 17:18 zhudan Exp $
 */

public class UserServiceJunitTest {

    private SampleServiceImpl sampleService = new SampleServiceImpl();

    @Test
    public void testGetMessage(){
        String msg = sampleService.message();
        Assert.assertNotNull(msg);
    }
}