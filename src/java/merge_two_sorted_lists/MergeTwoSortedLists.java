/**
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 *
 * Example 1:
 *
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 *
 * Example 2:
 *
 * Input: list1 = [], list2 = []
 * Output: []
 *
 * Example 3:
 *
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 *
 * Constraints:
 *
 *  The number of nodes in both lists is in the range [0, 50].
 *  -100 <= Node.val <= 100
 *  Both list1 and list2 are sorted in non-decreasing order.
 */


package src.java.merge_two_sorted_lists;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode newList = new ListNode();

        if (list1 == null) { // will check if the list number 1 is empty or not !!
            // If it is empty we just need to return back the list number 2 and we do not need to know what
            // is inside the list number 2.
            return list2;
        } else if (list2 == null) { // we will do the same thing as above code.
            return list1;
        } else if (list1.val < list2.val) { //Ok, now we know that the list is not the empty so we check the values.
            // If the value of list number 1 is lesser than list number 2, so we will add it to the new list.
            newList.val = list1.val;
            newList.next = mergeTwoLists(list1.next, list2); // for next value we call our function !!!.
        } else {
            // this is the same thing as above.
            newList.val = list2.val;
            newList.next = mergeTwoLists(list1, list2.next);
        }

        return newList;
    }
}
