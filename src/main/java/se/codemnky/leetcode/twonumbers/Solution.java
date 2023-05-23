package se.codemnky.leetcode.twonumbers;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Initialize result list with a dummy node
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        int carry = 0;

        // Iterate while there are still nodes in either list
        while (l1 != null || l2 != null) {
            int sum = carry;

            // Add the values of the current nodes, if they exist
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;         
            }

            // Update carry and sum values
            carry = sum / 10;
            sum = sum % 10;

            // Add sum to result list
            current.next = new ListNode(sum);
            current = current.next;
        }

        // If there is still a carry value, add it as a new node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // Return the result list, ignoring the dummy head
        return dummyHead.next;
    }
}
