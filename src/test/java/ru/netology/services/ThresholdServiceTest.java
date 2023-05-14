package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ThresholdServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/threshold.csv")
    public void testShouldWork (int expected, int income, int expenses, int threshold) {
        ThresholdService service = new ThresholdService();

        int actual = service.calcThreshold(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
