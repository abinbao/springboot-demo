
package com.beng;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.beng.model.Person;

@org.springframework.boot.test.context.SpringBootTest
@RunWith(SpringRunner.class)
public class SpringBootTest {

    @Autowired
    Person person;
    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void test() {
        System.out.println(person.toString());
    }

    @Test
    public void testXml() {
        System.out.println(applicationContext.containsBean("helloService"));
    }
}
