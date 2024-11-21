package org.sessions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class JUnitTestTest {

    @Test
    void summe_expect20_when10Plus10() {
        // GIVEN
        int a = 10;
        int b = 10;
        int expectedSum = 20;

        // WHEN
        int actualSum = JUnitTest.summe(a, b);

        // THEN
        assertEquals(expectedSum, actualSum);
    }
    @ParameterizedTest
    @CsvSource({
            "10, 10, 20",
            "11, 11, 22",
            "12, 12, 24"
    })
    void summe_expect20_when10Plus10(int a, int b, int expectedSum) {
        // WHEN
        int actualSum = JUnitTest.summe(a, b);

        // THEN
        assertEquals(expectedSum, actualSum);
    }
}