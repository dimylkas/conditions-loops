package com.globallogic.conditionsloops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WhichQuarterTest {

    private Task unit = new Task();

    @Test
    void whichQuarterFirstQuarter() {
        int actual = unit.whichQuarter(2, 3);
        assertEquals(1, actual);
    }

    @Test
    void whichQuarterSecondQuarter() {
        int actual = unit.whichQuarter(-2, 5);
        assertEquals(2, actual);
    }

    @Test
    void whichQuarterThirdQuarter() {
        int actual = unit.whichQuarter(-1, -7);
        assertEquals(3, actual);
    }

    @Test
    void whichQuarterFourthQuarter() {
        int actual = unit.whichQuarter(5, -1);
        assertEquals(4, actual);
    }

    @Test
    void whichQuarterOnXLine() {
        int actual = unit.whichQuarter(-2, 0);
        assertEquals(0, actual);
    }

    @Test
    void whichQuarterOnYLine() {
        int actual = unit.whichQuarter(0, 3);
        assertEquals(0, actual);
    }
}
