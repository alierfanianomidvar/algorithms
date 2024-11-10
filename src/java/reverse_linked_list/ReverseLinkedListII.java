package src.java.reverse_linked_list;

import java.util.Arrays;
import java.util.List;

class ListNode {
    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class ReverseLinkedListII {

    private ListNode successor = null;  // Node after the last reversed node

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;
        if (left == 1) {
            // Start reversal from the head
            return reverseN(head, right - left + 1);
        }

        // Find the node just before the start of the reversal
        ListNode prev = head;
        for (int i = 1; i < left - 1; i++) {
            prev = prev.next;
        }

        // Recursively reverse the next part of the list
        prev.next = reverseN(prev.next, right - left + 1);
        return head;
    }

    private ListNode reverseN(ListNode head, int count) {
        if (count == 1) {
            successor = head.next;
            return head;
        }

        ListNode newHead = reverseN(head.next, count - 1);
        head.next.next = head;
        head.next = successor;
        return newHead;
    }
}
