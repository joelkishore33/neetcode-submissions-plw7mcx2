/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        if (lists.length == 0){
            return dummy.next;
        }

        while(!(checkNull(lists))){
            ListNode curr = new ListNode(Integer.MAX_VALUE);
            int index = 0;
            for (int i = 0; i < lists.length; i++){
                if (lists[i] != null && lists[i].val <= curr.val){
                    curr.val = lists[i].val;
                    index = i;
                }
            }
            dummy.next = curr;
            dummy = dummy.next;
            lists[index] = lists[index].next;
        }

        return head.next;
    }
    private boolean checkNull(ListNode[] lists){
        for (int i = 0; i < lists.length; i++){
            if (lists[i] != null){
                return false;
            }
        }
        return true;
    }
}
