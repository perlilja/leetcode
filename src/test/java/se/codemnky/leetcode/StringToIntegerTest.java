package se.codemnky.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToIntegerTest {

    private StringToInteger cut = new StringToInteger();

    @Test
    void shouldHandleNull() {
        Assertions.assertThrows(IllegalArgumentException.class,() -> cut.myAtoi(null));
    }

    @Test
    void shouldHandleEmptyString() {
        Assertions.assertEquals(0, cut.myAtoi(""));
    }

    @Test
    void shouldHandleOnlyWhitespaceString() {
        Assertions.assertEquals(0, cut.myAtoi("    "));
    }

    @Test
    void shouldConvertInteger() {
        Assertions.assertEquals(1234, cut.myAtoi("1234"));
    }

    @Test
    void shouldConvertIntegerWithWhitespaces() {
        Assertions.assertEquals(51234, cut.myAtoi("   51234"));
    }

    @Test
    void shouldConvertLargeInteger() {
        Assertions.assertEquals(2147483647, cut.myAtoi("21474836460"));
    }

    @Test
    void shouldConvertLargeInteger2() {
        Assertions.assertEquals(2147483647, cut.myAtoi("9223372036854775808"));
    }

    @Test
    void shouldHandleNegativeValues() {
        Assertions.assertEquals(-1000, cut.myAtoi("  -1000"));
    }
}
