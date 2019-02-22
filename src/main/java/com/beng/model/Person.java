
package com.beng.model;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:/person.properties")
@ConfigurationProperties(prefix = "person") // 从配置文件中读取配置
// @Validated
public class Person {

    // @Email
    private String name;
    private Integer age;
    private List<String> own;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getOwn() {
        return own;
    }

    public void setOwn(List<String> own) {
        this.own = own;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", own=" + own + "]";
    }

}
