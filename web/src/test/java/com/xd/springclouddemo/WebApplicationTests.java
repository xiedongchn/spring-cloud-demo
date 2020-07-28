package com.xd.springclouddemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

//@SpringBootTest
class WebApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void instantTest() {
        Instant instant = Instant.parse("2020-07-28T07:03:00.00Z");
        System.out.println(ChronoUnit.MINUTES.between(instant, Instant.now()));
    }

}
