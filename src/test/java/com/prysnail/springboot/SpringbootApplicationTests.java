package com.prysnail.springboot;

import com.prysnail.springboot.jmx.sender.HelloSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    private HelloSender helloSender;

    @Test
    void contextLoads() {
        helloSender.send();
    }

}
