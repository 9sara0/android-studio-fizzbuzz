package com.sara.fizzbuzz;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by sara on 9/6/16.
 */
public class FizzBuzzTest {
    @Test
    public void getResultShuoldReturnFizzWhen3() {
        assertEquals("Fizz", FizzBuzz.getResult(3));
    }

    @Test
    public void getResultShouldRetunBuzzWhen5() {
        assertEquals("Buzz", FizzBuzz.getResult(5));
    }

    @Test
    public void getResultShouldReturnFizzBuzzWhen15() {
        assertEquals("FizzBuzz", FizzBuzz.getResult(15));
    }

    @Test
    public void getResultShouldReturnNumberOtherwise() {
        assertEquals("1", FizzBuzz.getResult(1));
    }

}
