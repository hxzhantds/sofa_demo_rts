/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.rtsdemo.acts.test.usercases;

import com.alipay.rtsdemo.acts.test.base.AbstractTestBase;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author zhudan
 * @version UserControllerTest: UserControllerTest.java, v 0.1 2019年12月03日 18:40 zhudan Exp $
 */
public class UserControllerTest extends AbstractTestBase {

    @Test
    public void testRequestJson() {
        ResponseEntity<String> responseEntity = testRestTemplate.getForEntity(urlHttpPrefix + "/json", String.class);
        Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        String responseBody = responseEntity.getBody();
        LOGGER.info(responseBody);
        Assert.assertTrue(responseBody.contains("zhangsan"));
    }

}