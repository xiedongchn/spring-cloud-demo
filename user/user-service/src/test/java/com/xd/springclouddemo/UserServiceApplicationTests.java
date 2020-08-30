package com.xd.springclouddemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

@RunWith(SpringRunner.class)
//@SpringBootTest
public class UserServiceApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void instantTest() {
        Instant instant = Instant.parse("2020-07-28T07:03:00.00Z");
        System.out.println(ChronoUnit.MINUTES.between(instant, Instant.now()));
    }

    @Test
    public void stringTest() {
        System.out.println("123".contains(null));
    }

}
