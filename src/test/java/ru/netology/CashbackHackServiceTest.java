package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainUnder1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 200;
        int expected = 800;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainEqual1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

}