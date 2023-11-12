package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class CashbackHackServiceTest {

    @Test
    public void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0IfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn500IfAmount5500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 5500;

        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldCalculateIfAmountIncorrect() {
        CashbackHackService service = new CashbackHackService();
        int amount = -50000;

        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);

    }
}