package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Assertions {
    Assertions assertions = new Assertions();

    @Test
    public void averageShouldBeZeroIfStudentDontHaveGrades() {
        Calculator calculator2 = new Calculator();
        assertEquals(100000, calculator2.getAverage(), 0.01);
    }
}
