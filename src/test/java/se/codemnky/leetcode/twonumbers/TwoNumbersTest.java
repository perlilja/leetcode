package se.codemnky.leetcode.twonumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TwoNumbersTest {

    private se.codemnky.leetcode.twonumbers.Solution classUnderTest = new Solution();

    /**
     * Input: l1 = [2,4,3], l2 = [5,6,4]
     * Output: [7,0,8]
     * Explanation: 342 + 465 = 807.
     */
    @Test
    void twoNumbersExample1() {
        ListNode first = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode second = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));

        Assertions.assertArrayEquals(toArray(expected),toArray(classUnderTest.addTwoNumbers(first, second)));
    }

    /**
     * Input: l1 = [0], l2 = [0]
     * Output: [0]
     */
    @Test
    void twoNumbersExample2() {
        ListNode first = new ListNode(0);
        ListNode second = new ListNode(0);

        ListNode expected = new ListNode(0);

        Assertions.assertArrayEquals(toArray(expected),toArray(classUnderTest.addTwoNumbers(first, second)));
    }

    /**
     * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
     * Output: [8,9,9,9,0,0,0,1]
     */
    @Test
    void twoNumbersExample3() {
        ListNode first = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode second = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        ListNode expected = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));

        Assertions.assertArrayEquals(toArray(expected),toArray(classUnderTest.addTwoNumbers(first, second)));
    }

    /**
     * Input: l1 = [2,4,9], l2 = [5,6,4,9]
     * 2+5 = 7
     * 4+6 = 0 + 1 i carry 0
     * 9+4 = 13 + 1 = 14, dbs 4 och 1 carry 4
     * 9+0 + 1 i carry = 10 dvs 0 och 1 i carry 0
     * 1 i carry 1
     * Output: [7,0,4,0,1]
     */
    @Test
    void twoNumbersExample4() {
        ListNode first = new ListNode(2, new ListNode(4, new ListNode(9)));
        ListNode second = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(9))));

        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(4, new ListNode(0, new ListNode(1)))));

        Assertions.assertArrayEquals(toArray(expected),toArray(classUnderTest.addTwoNumbers(first, second)));
    }

   Integer[] toArray(ListNode listNodes) {
        ArrayList<Integer> intArray = new ArrayList<Integer>();

        while(listNodes != null) {
            intArray.add(listNodes.val);
            listNodes = listNodes.next;
        }


        return intArray.toArray(new Integer[]{});
    }

}
