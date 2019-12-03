package com.alipay.rtsdemo.acts.test.base;

import com.alibaba.common.logging.Logger;
import com.alibaba.common.logging.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;


@ImportResource({"classpath*:test/META-INF/rtsdemo/*.xml", "classpath*:META-INF/spring/acts-core.xml"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class SOFABootTestApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SOFABootTestApplication.class);

    public static void main(String[] args) {
        try {
            SpringApplication.run(SOFABootTestApplication.class, args);
            LOGGER.info("SOFABoot Test App Start!!!");
        }catch (Throwable e){
            LOGGER.error("SOFABoot Test App Start Fail!!! More logs can be found on 1) logs/sofa-runtime/common-error.log"
                    + " 2) logs/spring/spring.log 3) logs/mvc/common-error.log 4) logs/health-check/common-error.log", e);
            throw e;
        }
    }
}
