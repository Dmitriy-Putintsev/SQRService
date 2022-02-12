package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SQRServiceTest {
    @Test
    void shouldSquaresOfNumbersInTheRange() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.bruteForceOfNumbers(200, 300);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSquaresOfNumbersInTheRange1() {
        SQRService service = new SQRService();
        int expected = 8;

        int actual = service.bruteForceOfNumbers(100, 300);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSquaresOfNumbersNotInTheRange() {
        SQRService service = new SQRService();
        int expected = 11;

        int actual = service.bruteForceOfNumbers(100, 500);

        assertNotEquals(expected, actual);
    }

}