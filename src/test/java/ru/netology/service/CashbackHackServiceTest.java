package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {


    @Test
    public void remain() {
        int amount = 500;
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void remain1000() {
        int amount = 1000;
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

}
