/*
* Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.



Example 1:
Input: head = [1,1,2]
Output: [1,2]
*
Example 2:
Input: head = [1,1,2,3,3]
Output: [1,2,3]
*
Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.
*
* */
package src.java.delete_duplicates;

import java.util.List;

public class deleteDuplicates {

    public ListNode Solution(ListNode head) {
        ListNode newList = new ListNode();
        return r(head);
    }


    public ListNode r(ListNode head) {

        if (head == null) {
            return null; // Base case: if the list is empty, nothing to do.
        }
        // Recursive case: if the next node is not null, check for duplicates.
        if (head.next != null && head.val == head.next.val) {
            // If the current node is a duplicate, skip it.
            head = r(head.next);
        } else {
            // If the current node is not a duplicate, continue to the next node.
            head.next = r(head.next);
        }
        return head; // Return the head of the modified list.

    }

}
