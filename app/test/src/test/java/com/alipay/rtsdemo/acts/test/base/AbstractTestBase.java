package com.alipay.rtsdemo.acts.test.base;

import org.junit.Before;
import org.junit.runner.RunWith;
import com.alibaba.common.logging.Logger;
import com.alibaba.common.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SOFABootTestApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public abstract class AbstractTestBase {

    public static final Logger LOGGER = LoggerFactory.getLogger(AbstractTestBase.class);

    @Autowired
    protected TestRestTemplate testRestTemplate;

    protected String urlHttpPrefix;

    /**
     * 8080
     */
    @LocalServerPort
    public int definedPort;

    @Before
    public void setUp() {
        urlHttpPrefix = "http://localhost:" + definedPort;
    }
}
