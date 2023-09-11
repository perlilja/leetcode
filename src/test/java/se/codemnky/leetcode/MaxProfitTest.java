package se.codemnky.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxProfitTest {

    private MaxProfit cut = new MaxProfit();

    @Test
    void testEmptyArray() {
        Assertions.assertEquals(0, cut.maxProfit(new int[]{}));
    }

    @Test
    void testOne() {
        Assertions.assertEquals(5, cut.maxProfit(new int[]{7,1,5,3,6,4}));

    }

    @Test
    void testTwo() {
        Assertions.assertEquals(0, cut.maxProfit(new int[]{7,6,4,3,1}));

    }


}
