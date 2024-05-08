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
    public ListNode reverseBetween(ListNode head, int left, int right) {


        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }

        ListNode check = head;

        for (int i = 0; i < left - 1; i++) {
            check = check.next;
        }

        List<ListNode> newHead = r(null, head, right, left);
        check.next.next = newHead.get(1);
        check.next = newHead.get(0);


        return head;
    }

    private List<ListNode> r(ListNode p, ListNode node, int right, int position) {

        if (position == right) {
            ListNode theNewNextForTheRightNode = node.next;
            node.next = p;
            return Arrays.asList(node, theNewNextForTheRightNode);
        }

        if (node.next != null) {
            List<ListNode> theNewNextForTheRightNode = r(node, node.next);
            node.next = p;
            return Arrays.asList(node, theNewNextForTheRightNode);
        }

        ListNode theNewNextForTheRightNode = node.next;
        node.next = p;
        return Arrays.asList(node, theNewNextForTheRightNode);
    }
}
