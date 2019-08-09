package com.globallogic.conditionsloops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfDigitsTest {

    private Task unit = new Task();

    @Test
    void numberOfDigitsOneDigit() {
        int actual = unit.numberOfDigits(3);
        assertEquals(1, actual);
    }

    @Test
    void numberOfDigitsTwoDigits() {
        int actual = unit.numberOfDigits(34);
        assertEquals(2, actual);
    }

    @Test
    void numberOfDigitsThreeDigits() {
        int actual = unit.numberOfDigits(934);
        assertEquals(3, actual);
    }
}
