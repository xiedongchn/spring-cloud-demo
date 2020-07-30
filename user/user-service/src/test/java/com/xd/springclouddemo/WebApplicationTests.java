package com.xd.springclouddemo;

import org.junit.Test;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

//@SpringBootTest
public class WebApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void instantTest() {
        Instant instant = Instant.parse("2020-07-28T07:03:00.00Z");
        System.out.println(ChronoUnit.MINUTES.between(instant, Instant.now()));
    }

}
