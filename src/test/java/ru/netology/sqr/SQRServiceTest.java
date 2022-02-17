package ru.netology.sqr;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


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
    void shouldTheSquareOfTheNumbersIsTheBoundaryOfTheRange() {
        SQRService service = new SQRService();
        int expected = 1;

        int actual = service.bruteForceOfNumbers(288, 289);

        assertEquals(expected, actual);
    }

    @Test
    void shouldTheSquareOfTheNumbersIsLessThanTheRange() {
        SQRService service = new SQRService();
        int expected = 0;

        int actual = service.bruteForceOfNumbers(9802, 10000);

        assertEquals(expected, actual);
    }

    @Test
    void shouldTheSquareOfTheNumberIsLargerThanTheRange() {
        SQRService service = new SQRService();
        int expected = 0;

        int actual = service.bruteForceOfNumbers(0, 99);

        assertEquals(expected, actual);
    }


    @Test
    void shouldSquaresOfNumbersInTheZeroRange() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.bruteForceOfNumbers(300, 300);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSquaresOfNumbersInTheReverseRange() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.bruteForceOfNumbers(300, 100);

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