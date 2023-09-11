package se.codemnky.leetcode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        // Set the current node to head, this should be last in the new list
        ListNode current = head;

        while (current != null) {
            // Set the next to point to the current next, this should be the new head for now.
            ListNode next = current.next;
            // current.next should point to the previous next node
            current.next = prev;
            // Set the prev to the current node, since it should be the next node in next iteration
            prev = current;
            // Set the current to the next node
            current = next;
        }

        return prev;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

