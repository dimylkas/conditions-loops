package com.globallogic.conditionsloops;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeasonTest {

    private Task unit = new Task();

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 12})
    void seasonWinter(int month) {
        String actual = unit.season(month);
        assertEquals("Winter", actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 4, 5})
    void seasonSpring(int month) {
        String actual = unit.season(month);
        assertEquals("Spring", actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {6, 7, 8})
    void seasonSummer(int month) {
        String actual = unit.season(month);
        assertEquals("Summer", actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {9, 10, 11})
    void seasonAutumn(int month) {
        String actual = unit.season(month);
        assertEquals("Autumn", actual);
    }
}
