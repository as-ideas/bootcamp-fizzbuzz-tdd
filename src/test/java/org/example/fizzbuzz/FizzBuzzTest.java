package org.example.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;


/**
 * FizzBuzzTest
 * 
 * This test suite lists a few wanted outputs of the fizz buzz game
 */
public class FizzBuzzTest {

    @Test
    public void fizzbuzz_shouldReturn_fizzbuzz_for_15_30_60() {
        Assert.assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
        Assert.assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(30));
        Assert.assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(60));
    }

    @Test
    public void fizzbuzz_shouldReturn_fizz_for_3_6_9() {
        Assert.assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
        Assert.assertEquals("Fizz", FizzBuzz.fizzbuzz(6));
        Assert.assertEquals("Fizz", FizzBuzz.fizzbuzz(9));
    }

    @Test
    public void fizzbuzz_shouldReturn_buzz_for_5_10_20() {
        Assert.assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
        Assert.assertEquals("Buzz", FizzBuzz.fizzbuzz(10));
        Assert.assertEquals("Buzz", FizzBuzz.fizzbuzz(20));
    }

    @Test
    public void fizzbuzz_shouldReturn_number_for_1_2_4() {
        Assert.assertEquals("1", FizzBuzz.fizzbuzz(1));
        Assert.assertEquals("2", FizzBuzz.fizzbuzz(2));
        Assert.assertEquals("4", FizzBuzz.fizzbuzz(4));
    } 

}
