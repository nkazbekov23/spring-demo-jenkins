package com.demoproject.springbootdemo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

//@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootDemoApplicationTest {

    @Autowired
    SpringBootDemoApplication springBootDemoApplication;

    @Test
    void hello() {
        String result = "hello";
        assertEquals(result, springBootDemoApplication.hello());
    }
}