package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThresholdServiceTest {

    @Test
    public void testShouldWorkFirst() {
        ThresholdService service = new ThresholdService();

        int expected = 3;
        int actual = service.calcThreshold(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testShouldWorkSecond() {
        ThresholdService service = new ThresholdService();

        int expected = 2;
        int actual = service.calcThreshold(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}
