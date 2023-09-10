package se.codemnky.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TopKElementsTest {

    private TopKElemenets cut = new TopKElemenets();


    @Test
    void testNull() {
        Assertions.assertThrows(IllegalArgumentException.class,() -> cut.topKFrequent(null, 0));
    }

    @Test
    void testTop2() {
        Assertions.assertArrayEquals(new int[]{1,2}, cut.topKFrequent(new int[]{1,1,1,2,2,3}, 2));
    }

    @Test
    void testTop3() {
        Assertions.assertArrayEquals(new int[]{1,5,2}, cut.topKFrequent(new int[]{4,4,1,1,1,2,2,2,3,3,5,5,5}, 3));
    }

}
