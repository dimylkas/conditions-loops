package com.globallogic.conditionsloops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductOfDigitTest {

    private Task unit = new Task();

    @Test
    void productOfDigits() {
        int actual = unit.productOfDigits(257);
        assertEquals(70, actual);
    }
}
