package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        int sumResult = calculator.sum(a, b);
        assertEquals(15, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        int SubtractResult = calculator.subtract(a, b);
        assertEquals(5, SubtractResult);
    }

    @Test
    public void testPow() {
        Calculator calculator = new Calculator();
        double a = 10;
        double b = 5;
        double powResult = calculator.pow(a, b);
        assertEquals(100000, powResult, 0.01);
    }
}
