package se.codemnky.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZigzagTest {

    private Zigzag classUnderTest = new Zigzag();


    /*
     * Input: PAYPALISHIRING
     * Output: PAHNAPLSIIGYIR
     */
    @Test
    void testExampleOne() {
        Assertions.assertEquals("PAHNAPLSIIGYIR", classUnderTest.convert("PAYPALISHIRING", 3));
    }

    /*
     * Input: PAYPALISHIRING
     * Output: PINALSIGYAHRPI
     */
    @Test
    void testExampleTwo() {
        Assertions.assertEquals("PINALSIGYAHRPI", classUnderTest.convert("PAYPALISHIRING", 4));
    }

    /*
     * Input: A
     * Output: A
     */
    @Test
    void testExampleThree() {
        Assertions.assertEquals("A", classUnderTest.convert("A", 1));
    }


}
