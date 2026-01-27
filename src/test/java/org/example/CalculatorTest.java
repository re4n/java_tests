package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testSum() {
        Calculator calculator = new Calculator();
        assertEquals(7, calculator.sum(1,6));
        assertEquals(0, calculator.sum(-1,1));
        assertEquals(4, calculator.sum(2,2));
        assertEquals(0, calculator.sum(0,0));
    }
    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.subtract(6,2));
        assertEquals(0, calculator.subtract(1,1));
        assertEquals(5, calculator.subtract(8,3));
        assertEquals(0, calculator.subtract(0,0));
        assertEquals(6, calculator.subtract(2,-4));
    }
    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.multiply(2,2));
        assertEquals(0, calculator.multiply(0,0));
        assertEquals(8, calculator.multiply(2,4));
        assertEquals(-20, calculator.multiply(-5,4));
    }

    @Test
    void testValues() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.sum(Integer.MAX_VALUE, 1));
        assertThrows(ArithmeticException.class, () -> calculator.subtract(Integer.MIN_VALUE, 1));
        assertThrows(ArithmeticException.class, () -> calculator.multiply(Integer.MAX_VALUE, 2));
    }
    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.divide(2,2));
        assertEquals(9, calculator.divide(45,5));
        assertEquals(5, calculator.divide(20,4));
        assertEquals(6, calculator.divide(12,2));
    }

    @Test
    void testDivideThrow(){
        Calculator calculator = new Calculator();
        ArithmeticException ex = assertThrows(ArithmeticException.class, () -> calculator.divide(1,0));
        assertEquals("Division by zero", ex.getMessage());
    }
}
