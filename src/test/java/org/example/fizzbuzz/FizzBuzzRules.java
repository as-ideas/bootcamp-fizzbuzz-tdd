package org.example.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzRules {

     @Test
     public void fizzbuzz_shouldReturn_FIZZ_if_number_is_multiples_of_3() {
        Assert.assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
        Assert.assertEquals("Fizz", FizzBuzz.fizzbuzz(6));
        Assert.assertEquals("Fizz", FizzBuzz.fizzbuzz(9));
     }

     
     @Test
     public void fizzbuzz_shouldReturn_BUZZ_if_number_is_multiples_of_5() {
        Assert.assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
        Assert.assertEquals("Buzz", FizzBuzz.fizzbuzz(10));
        Assert.assertEquals("Buzz", FizzBuzz.fizzbuzz(25));
     }

          
     @Test
     public void fizzbuzz_shouldReturn_FIZZBUZZ_if_number_is_multiples_of_3_and_multiples_of_5() {
        Assert.assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
        Assert.assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(30));
        Assert.assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(60));
     }

     @Test
     public void fizzbuzz_shouldReturn_Number_if_number_is_neither_multiple_of_3_or_5_or_both() {
        Assert.assertEquals("1", FizzBuzz.fizzbuzz(1));
        Assert.assertEquals("17", FizzBuzz.fizzbuzz(17));
        Assert.assertEquals("43", FizzBuzz.fizzbuzz(43));
     }
}