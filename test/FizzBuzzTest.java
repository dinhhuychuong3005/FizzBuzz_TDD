import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzz() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(result,expected);
    }
    @Test
    void fizzBuzz1() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(result,expected);
    }
    @Test
    void fizzBuzz2() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(result,expected);
    }
    @Test
    void fizzBuzz3() {
        int number = 52;
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(result,expected);
    }
    @Test
    void fizzBuzz4() {
        int number = 22;
        String expected = "Hai Hai";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(result,expected);
    }
}