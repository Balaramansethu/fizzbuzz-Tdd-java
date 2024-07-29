package com.fizzbuzz;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

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
        //Assert
        assertThat(fizzbuzz.fizz(three), is(equalTo("fizz")));
    }

// five and its multiples are buzz
    @Test
    void ToReturnBuzzIfTheInputIsFive()
    {
        //Arrange
        int five= 5;
        //Assert
        assertThat(fizzbuzz.buzz(five), is(equalTo("buzz")));
    }
// three and five multiples are fizzbuzz
    @Test
    void ToReturnFizzbuzzIfTheInputIsMultipleOfThreeAndFive()
    {
        //Arrange
        int input = 15;
        //Assert
        assertThat(fizzbuzz.fizzbuzzInput(input), is(equalTo("fizzbuzz")));
    }
}
