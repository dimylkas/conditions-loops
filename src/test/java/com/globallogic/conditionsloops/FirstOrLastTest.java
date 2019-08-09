package com.globallogic.conditionsloops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstOrLastTest {

    private Task unit = new Task();

    @Test
    void firstOrLastFirstBigger() {
        String actual = unit.firstOrLast(123);
        assertEquals("3", actual);
    }

    @Test
    void firstOrLastLastBigger() {
        String actual = unit.firstOrLast(721);
        assertEquals("7", actual);
    }

    @Test
    void firstOrLastEqual() {
        String actual = unit.firstOrLast(525);
        assertEquals("=", actual);
    }
}
