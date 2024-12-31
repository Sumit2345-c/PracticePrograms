package com.service.test;

import static org.junit.jupiter.api.Assertion.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.params.provider.CsvSource;

import com.service.EvenOrOdd;

class EvenOrOddTest {

    @ParameterizedTest
    @CsvSource (value={"10,even","5,odd","12,even","15,odd"})
    void testEvenOrOddNumber(){
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        String actualResult = evenOrOdd.evenOrOddNumber(input);
        assertEquals(excepted,actualResult);
    }
}