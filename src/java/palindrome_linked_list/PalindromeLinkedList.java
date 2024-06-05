package src.java.palindrome_linked_list;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        ListNode reversedHead = reverseAndCloneList(head);
        ListNode tempHead = head; // Use a temporary pointer to avoid modifying the original head pointer.

        while (reversedHead != null && tempHead != null) {
            if (reversedHead.val != tempHead.val) {
                return false;
            }
            reversedHead = reversedHead.next;
            tempHead = tempHead.next;
        }

        return true;
    }

    // Helper method to reverse and clone a linked list
    private ListNode reverseAndCloneList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode newNode = new ListNode(current.val); // Create a new node with the current value
            newNode.next = prev;
            prev = newNode;
            current = current.next;
        }
        return prev;
    }


    /**
     better solution for this problem is this - >
     * using stack  - >
     * public boolean isPalindrome(ListNode head) {
     Stack<Integer> stack = new Stack();
     ListNode curr = head;
     while(curr != null) {
     stack.push(curr.val);
     curr = curr.next;
     }
     curr = head;
     while(curr != null && curr.val == stack.pop()) {
     curr = curr.next;
     }
     return curr == null;
     }
     *  */


}
