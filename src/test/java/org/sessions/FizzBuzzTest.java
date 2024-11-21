package org.sessions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void expect1_whenGivenNumber1() {
        //GIVEN
        int number = 1;
        //WHEN
        String actual= FizzBuzz.calculate(number);
        //THEN
        String expected = "1";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expect2_whenGivenNumber2() {
        //GIVEN
        int number = 2;
        //WHEN
        String actual= FizzBuzz.calculate(number);
        //THEN
        String expected = "2";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expectFizz_whenGivenNumber3() {
        //GIVEN
        int number = 3;
        //WHEN
        String actual= FizzBuzz.calculate(number);
        //THEN
        String expected = "Fizz";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expect4_whenGivenNumber4() {
        //GIVEN
        int number = 4;
        //WHEN
        String actual= FizzBuzz.calculate(number);
        //THEN
        String expected = "4";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expectBuzz_whenGivenNumber5() {
        //GIVEN
        int number = 5;
        //WHEN
        String actual= FizzBuzz.calculate(number);
        //THEN
        String expected = "Buzz";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expectFizzBuzz_whenGivenNumber15() {
        //GIVEN
        int number = 15;
        //WHEN
        String actual= FizzBuzz.calculate(number);
        //THEN
        String expected = "FizzBuzz";
        Assertions.assertEquals(expected, actual);
    }
}