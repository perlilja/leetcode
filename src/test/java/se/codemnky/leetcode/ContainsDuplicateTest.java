package se.codemnky.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateTest {

    private ContainsDuplicate cut  = new ContainsDuplicate();

    @Test
    void testOne() {
        Assertions.assertTrue(cut.containsDuplicate(new int[]{1,2,3,1}));
        Assertions.assertFalse(cut.containsDuplicate(new int[]{1,2,3,4}));
        Assertions.assertTrue(cut.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

}
