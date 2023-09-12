package se.codemnky.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniqueOccurrencesTest {

    UniqueOccurrences cut = new UniqueOccurrences();

    @Test
    void testOne() {
        Assertions.assertTrue(cut.uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }

    @Test
    void testTwo() {
        Assertions.assertFalse(cut.uniqueOccurrences(new int[]{1,2}));
    }

    @Test
    void testThree() {
        Assertions.assertTrue(cut.uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }


}
