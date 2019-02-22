package com.beng.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beng.service.HelloService;

/**
 * 配置类：给容器中注册组件（bean 的名称默认就是方法名）
 * 
 * @author apple
 */
@Configuration
public class ConfigurationBean {

    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}
