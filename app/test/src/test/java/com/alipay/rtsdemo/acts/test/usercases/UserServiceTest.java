/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.rtsdemo.acts.test.usercases;

import com.alipay.rtsdemo.acts.test.base.AbstractTestBase;
import com.alipay.rtsdemo.facade.SampleService;
import com.alipay.rtsdemo.facade.domain.User;
import com.alipay.sofa.runtime.test.autowire.annotation.XAutoWire;
import com.alipay.sofa.runtime.test.junit4.SofaJUnit4ClassRunner;
import lombok.Setter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 *
 * @author zhudan
 * @version UserServiceTest: UserServiceTest.java, v 0.1 2019年12月03日 19:12 zhudan Exp $
 */
@RunWith(SofaJUnit4ClassRunner.class)
@Setter
public class UserServiceTest extends AbstractTestBase {


    @XAutoWire(value = XAutoWire.BY_NAME, module = "com.alipay.rtsdemo.biz.service.impl")
    private SampleService sampleService;

    @Test
    public void test4getUser() {
        User user = sampleService.getUser();
        Assert.assertEquals("lisi", user.getName());
    }

}