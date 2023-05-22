package se.codemnky.leetcode.twosum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTests {

    private Solution classUnderTest = new Solution();

    @Test
    void twoSumOkTwoNumbers() {
        Assertions.assertArrayEquals(new int[]{0,1}, classUnderTest.twoSum(new int[]{1,1}, 2));
    }


    @Test
    void twoSumOkTenNumbers() {
        Assertions.assertArrayEquals(new int[]{0,4}, classUnderTest.twoSum(new int[]{1,2,3,4,5,6,7,8,9}, 6));
    }


}
