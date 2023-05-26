package se.codemnky.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromeTest {

    private LongestPalindrome classUnderTest = new LongestPalindrome();

    @Test
    void testWithEampleOne() {
        Assertions.assertEquals("aba", classUnderTest.longestPalindrome("babad"));
    }

    @Test
    void testWithEampleTwo() {
        Assertions.assertEquals("bb", classUnderTest.longestPalindrome("cbbd"));
    }
}
