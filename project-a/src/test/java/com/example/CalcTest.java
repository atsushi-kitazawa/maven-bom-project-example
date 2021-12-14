package com.example;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class CalcTest {
    @Test
    public void testAdd() {
        int ret = Calc.add(10, 20);
        assertThat(ret, CoreMatchers.is(30));
    }

    @Test
    public void testSub() {
        int ret = Calc.sub(30, 20);
        assertThat(ret, CoreMatchers.is(10));
    }
}
