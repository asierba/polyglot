package asierba.fizzbuzz.tests;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static asierba.fizzbuzz.FizzBuzz.range;
import static junit.framework.TestCase.assertEquals;


public class TestFizzbuzz {
    @Test
    public void NotMultipleOf3Or5() {
        assertEquals("1", range(1));
        assertEquals("2", range(2));
    }

    @Test
    public void MultipleOf3() {
        assertEquals("Fizz", range(3));
        assertEquals("Fizz", range(6));
        assertEquals("Fizz", range(9));
    }

    @Test
    public void MultipleOf5() {
        assertEquals("Buzz", range(5));
        assertEquals("Buzz", range(10));
        assertEquals("Buzz", range(20));
    }

    @Test
    public void MultipleOf3And5() {
        assertEquals("FizzBuzz", range(15));
        assertEquals("FizzBuzz", range(30));
    }

    @Test
    public void RangeOfFizzBuzzes() {
        List<String> expected = Arrays.asList(new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"});
        assertEquals(expected, range(1, 10));
    }

}
