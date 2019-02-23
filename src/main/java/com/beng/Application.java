package com.beng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// SpringBoot 底层使用 slf4 和 logback
//@ImportResource(locations = { "classpath:beans.xml" })
@SpringBootApplication // 标注这是一个 spring boot 应用
public class Application {

    private static Logger logger = LoggerFactory.getLogger(Application.class);
    private static ConfigurableApplicationContext ctx;

    public static void main(String[] args) throws Exception {
        ctx = SpringApplication.run(Application.class, args);
        String[] profiles = ctx.getEnvironment().getActiveProfiles();
        for (String profile : profiles) {
            logger.info("Now active profile:" + profile);
        }
    }

}
