package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatServiceTest {

    @Test
    void findMax() {
        StatService service = new StatService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxIfIncomesSimilar() {
        StatService service = new StatService();
        long[] incomesInBillions = {5, 5, 5, 5, 5};
        long expected = 5;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxIfIncomeMoreThenCurrentMax() {
        StatService service = new StatService();
        long[] incomesInBillions = {5, 25, 103, 5, 33, 21};
        long expected = 103;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}