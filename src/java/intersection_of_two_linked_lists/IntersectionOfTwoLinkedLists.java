package src.java.intersection_of_two_linked_lists;


public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0;
        int sizeB = 0;
        ListNode a = headA;
        ListNode b = headB;

        // Find the size of both linked lists
        while (a != null) {
            sizeA++;
            a = a.next;
        }
        while (b != null) {
            sizeB++;
            b = b.next;
        }

        // Adjust the starting point for the longer list
        while (sizeA > sizeB) {
            headA = headA.next;
            sizeA--;
        }
        while (sizeB > sizeA) {
            headB = headB.next;
            sizeB--;
        }

        // Traverse both lists together to find the intersection point
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        // If no intersection is found
        return null;
    }

}
