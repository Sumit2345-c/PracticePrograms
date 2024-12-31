package com.service.test;

import static org.junit.jupiter.api.Assertion.fail;

import org.junit.jupitor.api.Test;

import com.service.Calculator;

class CalculatorTest {

    @Test
    void testAdd(){
        Calculator calc = new Calculator();
        int actualResult = calc.add(10,5);
        int expectedResult = 15;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void testMultiply(){
        Calculator calc = new Calculator();
        int actualResult = calc.multiply(10,5);
        int expectedResult = 50;
        assertEquals(expectedResult,actualResult);
    }    
}