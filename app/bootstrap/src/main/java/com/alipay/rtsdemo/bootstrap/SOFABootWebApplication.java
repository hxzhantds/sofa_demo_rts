package com.alipay.rtsdemo.bootstrap;

import com.alibaba.common.logging.Logger;
import com.alibaba.common.logging.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * SOFABootWebApplication
 * <p>
 * <p>
 * Created by yangguanchao on 16/12/9.
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class SOFABootWebApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SOFABootWebApplication.class);

    public static void main(String[] args) {
        try {
            SpringApplication.run(SOFABootWebApplication.class, args);
            LOGGER.info("SOFABoot Web App Start!!!");
        }catch (Throwable e){
            LOGGER.error("SOFABoot Web App Start Fail!!! More logs can be found on 1) logs/sofa-runtime/common-error.log"
                    + " 2) logs/spring/spring.log 3) logs/mvc/common-error.log 4) logs/health-check/common-error.log", e);
            throw e;
        }
    }
}
