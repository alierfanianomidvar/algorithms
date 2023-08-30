package src.java.merge_two_sorted_lists;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode newList = new ListNode();

        if(list1 == null){
            return list2;
        } else if (list2 == null){
            return list1;
        } else if( list1.val < list2.val){
            newList.val = list1.val;
            newList.next = mergeTwoLists(list1.next,list2);
        } else {
            newList.val = list2.val;
            newList.next = mergeTwoLists(list1,list2.next);
        }

        return newList;
    }
}
