package com.fizzbuzz;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest
{
    private static Fizzbuzz fizzbuzz;
    @BeforeAll
    static void beforeAllExecution(){
        fizzbuzz  = new Fizzbuzz();
    }

//three and its multiples are fizz
    @Test
    void ToReturnFizzIfTheInputIsThree()
    {
        //Arrange
        int three = 3;
        //Act
        String actualOutput = fizzbuzz.fizz(three);
        //Assert
        assertEquals("fizz",actualOutput);
    }

// five and its multiples are buzz
    @Test
    void ToReturnBuzzIfTheInputIsFive()
    {
        //Arrange
        int five= 5;
        //Act
        String actualOutput = fizzbuzz.buzz(five);
        //Assert
        assertEquals("buzz",actualOutput);

    }
// three and five multiples are fizzbuzz
    @Test
    void ToReturnFizzbuzzIfTheInputIsMultipleOfThreeAndFive()
    {
        //Arrange
        int input = 15;
        //Act
        String actualOutput = fizzbuzz.fizzbuzzInput(input);
        //Assert
        assertEquals("fizzbuzz",actualOutput);
    }
}
