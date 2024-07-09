package src.java.reverse_linked_list;

import javax.print.DocFlavor;
import java.util.List;


public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        if(head == null){
            return head;
        }
        return r(null, head);
    }

    private ListNode r(ListNode p, ListNode node) {

        if (node.next != null) {
            ListNode newHead = r(node, node.next);
            node.next = p;
            return newHead;
        }
        node.next = p;
        return node;
    }
}
