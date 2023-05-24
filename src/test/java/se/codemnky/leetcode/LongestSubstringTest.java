package se.codemnky.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringTest {

    private LongestSubString classUnderTest = new LongestSubString();


    /*
     * Input: s = "abcabcbb"
     * Output: 3
     */
    @Test
    void testExampleOne() {
        Assertions.assertEquals(3, classUnderTest.lengthOfLongestSubstring("abcabcbb"));
    }

    /*
    * Input: bbbbb
    * Output: 1
    */
    @Test
    void testExampleTwo() {
        Assertions.assertEquals(1, classUnderTest.lengthOfLongestSubstring("bbbbb"));
    }

    /*
     * Input: pwwkew
     * Output: 3
     */
    @Test
    void testExampleThree() {
        Assertions.assertEquals(3, classUnderTest.lengthOfLongestSubstring("pwwkew"));
    }

    /*
     * Input: dvdf
     * Output: 3
     */
    @Test
    void testExampleFour() {
        Assertions.assertEquals(3, classUnderTest.lengthOfLongestSubstring("dvdf"));
    }




}
