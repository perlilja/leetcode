package se.codemnky.leetcode;

import java.util.Arrays;

public class MedianTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // We only need to process the arrays until we found the median, so calculate median first
        int median = (nums1.length + nums2.length) / 2;
        // Check if total length is even
        boolean isEven = (nums1.length + nums2.length) % 2 == 0;

        int value = 0;
        int prevValue = 0;
        int pos1 = 0;
        int pos2 = 0;

        for (int i = 0; i <= median; i++) {
            prevValue = value;
            if (pos1 < nums1.length && pos2 < nums2.length) {
                value = nums1[pos1] < nums2[pos2] ? nums1[pos1++] : nums2[pos2++];
            } else if (pos1 < nums1.length) {
                value = nums1[pos1++];
            } else {
                value = nums2[pos2++];
            }
        }

        if (isEven) {
            return (prevValue + value) / 2.0;
        } else {
            return value;
        }
    }
}
