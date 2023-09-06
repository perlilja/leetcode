package se.codemnky.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    private IntegerToRoman cut = new IntegerToRoman();

    @Test
    void testThreeToRoman() {
        Assertions.assertEquals("III", cut.intToRoman(3));
    }

    @Test
    void testFourToRoman() {
        Assertions.assertEquals("IV", cut.intToRoman(4));
    }

    @Test
    void testFiveToRoman() {
        Assertions.assertEquals("V", cut.intToRoman(5));
    }

    @Test
    void test58ToRoman() {
        Assertions.assertEquals("LVIII", cut.intToRoman(58));
    }

    @Test
    void test1994ToRoman() {
        Assertions.assertEquals("MCMXCIV", cut.intToRoman(1994));
    }
}
