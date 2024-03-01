package src.java.linked_list_cycle;


import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> visitedNode = new HashSet<ListNode>();
        visitedNode.add(head);
            System.out.println(visitedNode);
        return r(head.next, visitedNode);
    }

    private boolean r(ListNode node, HashSet<ListNode> visitedNode){

        if(node == null){
            return false;
        }
        if(visitedNode.contains(node)){
            return true;
        } else  {
            visitedNode.add(node);
            return r(node.next, visitedNode);
        }
    }


    // best way - >
    /*
    * public boolean hasCycle(ListNode head) {
        ListNode slow_pointer = head, fast_pointer = head;
        while (fast_pointer != null && fast_pointer.next != null) {
            slow_pointer = slow_pointer.next;
            fast_pointer = fast_pointer.next.next;
            if (slow_pointer == fast_pointer) {
                return true;
            }
        }
        return false;
    }
    * */
}
