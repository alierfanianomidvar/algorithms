package src.java.remove_linked_list_elements;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode current = dummy;

        // Traverse the list
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        // Return the new head
        return dummy.next;
    }



}
