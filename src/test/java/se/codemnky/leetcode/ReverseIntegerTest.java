package se.codemnky.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseIntegerTest {

    private ReverseInteger cut = new ReverseInteger();


    @Test
    void testOne() {

        Assertions.assertEquals(321, cut.reverse(123));
        Assertions.assertEquals(-321, cut.reverse(-123));
        Assertions.assertEquals(21, cut.reverse(120));


    }



}
