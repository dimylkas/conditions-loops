package com.globallogic.conditionsloops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianNumberTest {

    private Task unit = new Task();

    @Test
    void medianNumberFirstNumber() {
        int actual = unit.medianNumber(4, 1, 8);
        assertEquals(4, actual);
    }

    @Test
    void medianNumberSecondNumber() {
        int actual = unit.medianNumber(2, 5, 8);
        assertEquals(5, actual);
    }

    @Test
    void medianNumberThirdNumber() {
        int actual = unit.medianNumber(2, 5, 3);
        assertEquals(3, actual);
    }
}
