package org.example.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateAtZero() {
        int expected = 1000;
        int actual = service.remain(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAt1() {
        int expected = 999;
        int actual = service.remain(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAt999() {
        int expected = 1;
        int actual = service.remain(999);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAt1000() {
        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAt1001() {
        int expected = 0;
        int actual = service.remain(1001);

        Assert.assertEquals(expected, actual);
    }
}
