package se.codemnky.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.codemnky.leetcode.TwoSum;

public class TwoSumTests {

    private TwoSum classUnderTest = new TwoSum();

    @Test
    void twoSumOkTwoNumbers() {
        Assertions.assertArrayEquals(new int[]{0,1}, classUnderTest.twoSum(new int[]{1,1}, 2));
    }


    @Test
    void twoSumOkTenNumbers() {
        Assertions.assertArrayEquals(new int[]{0,4}, classUnderTest.twoSum(new int[]{1,2,3,4,5,6,7,8,9}, 6));
    }


}
