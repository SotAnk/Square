package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @org.junit.jupiter.api.Test
    void shouldCalculateNumberSQRT() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calculateSQRT(200,300);
        assertEquals(expected,actual);
    }
}