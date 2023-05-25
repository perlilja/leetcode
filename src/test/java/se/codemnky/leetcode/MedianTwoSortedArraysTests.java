package se.codemnky.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MedianTwoSortedArraysTests {

    private MedianTwoSortedArrays classUnderTest = new MedianTwoSortedArrays();

    /*
    * Input: nums1 = [1,3], nums2 = [2]
    * Output: 2.00000
     */
    @Test
    void testWithExampleOne() {
        Assertions.assertEquals(2, classUnderTest.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
    }

    /* Input: nums1 = [1,2], nums2 = [3,4]
    Output: 2.50000
    Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
     */
    @Test
    void testWithExampleTwo() {
        Assertions.assertEquals(2.5, classUnderTest.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }

    /* Input: nums1 = [0,0], nums2 = [0,0]
    Output: 0
    Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
     */
    @Test
    void testWithExamplThree() {
        Assertions.assertEquals(0, classUnderTest.findMedianSortedArrays(new int[]{0,0}, new int[]{0,0}));
    }

}
