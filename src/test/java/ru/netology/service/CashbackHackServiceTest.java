package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void testRemain() {
        int amount = 900;
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void Remain1000() {
        int amount = 1000;
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void Remain1001() {
        int amount = 1001;
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void Remain999() {
        int amount = 999;
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void Remain1() {
        int amount = 1;
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    public void Remain0() {
        int amount = 0;
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

}