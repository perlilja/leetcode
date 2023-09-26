package se.codemnky.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    RemoveDuplicates cut = new RemoveDuplicates();

    @Test
    void testSimpleArray() {
        int[] data = new int[]{1,1,2};
        int[] expected = new int[]{1,2};

        int k = cut.removeDuplicates(data);
        Assertions.assertEquals(2, k);

        for (int i = 0; i < k; i++) {
            Assertions.assertEquals(expected[i], data[i]);
        }

    }


    @Test
    void testLongerArray () {
        int[] data = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] expected = new int[]{0,1,2,3,4};

        int k = cut.removeDuplicates(data);
        Assertions.assertEquals(5, k);

        for (int i = 0; i < k; i++) {
            Assertions.assertEquals(expected[i], data[i]);
        }
    }

}