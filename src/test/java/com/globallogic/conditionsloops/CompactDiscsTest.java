package com.globallogic.conditionsloops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompactDiscsTest {

    private Task unit = new Task();

    @Test
    void compactDiscsLessThan20() {
        int actual = unit.compactDiscs(10);
        assertEquals(20, actual);
    }

    @Test
    void compactDiscsForSmallPack() {
        int actual = unit.compactDiscs(20);
        assertEquals(30, actual);
    }

    @Test
    void compactDiscsForMoreThanSmallPack() {
        int actual = unit.compactDiscs(25);
        assertEquals(40, actual);
    }

    @Test
    void compactDiscsTwoSmallPacks() {
        int actual = unit.compactDiscs(40);
        assertEquals(60, actual);
    }

    @Test
    void compactDiscsMoreThanTwoSmallPacks() {
        int actual = unit.compactDiscs(50);
        assertEquals(80, actual);
    }

    @Test
    void compactDiscsBigPack() {
        int actual = unit.compactDiscs(100);
        assertEquals(100, actual);
    }

    @Test
    void compactDiscsMoreThanBigPack() {
        int actual = unit.compactDiscs(102);
        assertEquals(104, actual);
    }

    @Test
    void compactDiscsSmallAndBigPack() {
        int actual = unit.compactDiscs(120);
        assertEquals(130, actual);
    }

    @Test
    void compactDiscsMoreThanSmallAndBigPack() {
        int actual = unit.compactDiscs(125);
        assertEquals(140, actual);
    }
}
