package org.task;

import org.junit.jupiter.api.Test;
import org.sessions.JUnitTest;

import static org.junit.jupiter.api.Assertions.*;

class task_JUnitTestTest {

    @Test
    void summe_expect20_when10Plus10() {
        // GIVEN
        int a = 10;
        int b = 10;
        int expectedSum = 20;
        // WHEN
        int actualSum = task_JUnitTest.summe(a, b);
        // THEN
        assertEquals(expectedSum, actualSum);

    }

    @Test
    void isEven_expectTrue_when4() {
        // GIVEN
        int a = 4;
        // WHEN
        boolean acutalIsEven = task_JUnitTest.isEven(a);
        // THEN
        assertTrue(acutalIsEven);
    }

    @Test
     void product_expect10_when2mult5() {
        // GIVEN
        int a = 2;
        int b = 5;
        int expectedProduct = 10;
        // WHEN
        int actualProduct = task_JUnitTest.product(a, b);
        // THEN
        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    void upperCase_expectHALLO_whenhallo() {
        // GIVEN
        String result = "hallo";
        // WHEN
        String acutalUpperCase = task_JUnitTest.upperCase(result);
        // THEN
        assertEquals(result.toUpperCase(), acutalUpperCase);
    }

    @Test
    void numberPositive_expectTrue_when4() {
        // GIVEN
        int a = 4;
        // WHEN
        boolean acutalIsPositive = task_JUnitTest.numberPositive(a);
        // THEN
        assertTrue(acutalIsPositive);
    }
}