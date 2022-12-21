package com.example.slm_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Demo1ApplicationTests {

    @Autowired
    Controller Controller;

    @Autowired
    PercService percService;

    @Test
    void testNichtGenügendmitController() {
        Assertions.assertEquals(5, Controller.getPercentage(20));
    }

    @Test
    void testEinsermitService() {
        Assertions.assertEquals(1, percService.getPercentage(90));
    }

}

