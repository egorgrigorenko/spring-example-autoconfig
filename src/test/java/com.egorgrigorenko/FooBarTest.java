package com.egorgrigorenko;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = FooBarConfig.class)
public class FooBarTest {
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private Bar b;

    @Test
    public void func_givenBar_whenFunc_thenLog() {
        // given
        String s = "Hello, world!";

        // when
        b.func(s);

        // then
        assertEquals(s + "\n", log.getLog());
    }
}
