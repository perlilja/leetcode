package se.codemnky.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {

    RomanToInteger cut = new RomanToInteger();


    @Test
    void TestIII() {
        Assertions.assertEquals(3, cut.romanToInt("III"));
    }

    @Test
    void TestIV() {
        Assertions.assertEquals(4, cut.romanToInt("IV"));
    }

    @Test
    void TestIX() {
        Assertions.assertEquals(9, cut.romanToInt("IX"));
    }

    @Test
    void testLVIIIToRoman() {
        Assertions.assertEquals(58, cut.romanToInt("LVIII"));
    }

    @Test
    void TestMCMXCIV() {
        Assertions.assertEquals(1994, cut.romanToInt("MCMXCIV"));
    }


}
