package com.fizzbuzz;

public class Fizzbuzz
{
    // For fizz functionality
    public String fizz(int input)
    {
        if (input % 3 == 0) {
            return "fizz";
        }
        if(input % 5 == 0)
        {
            return "buzz";
        }
        return String.valueOf(input);
    }

    // For buzz functionality
    public String buzz(int input)
    {
        if (input % 3 == 0) {
            return "fizz";
        }
        if(input % 5 == 0)
        {
            return "buzz";
        }
        return String.valueOf(input);
    }

    // For fizzbuzz functionality
    public String fizzbuzzInput(int input)
    {
        if(input % 3 == 0 && input % 5 == 0)
        {
            return "fizzbuzz";
        }
        if (input % 3 == 0) {
            return "fizz";
        }
        if(input % 5 == 0)
        {
            return "buzz";
        }
        return String.valueOf(input);
    }
}