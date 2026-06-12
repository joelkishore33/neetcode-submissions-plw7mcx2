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
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null){
            return head;
        }
        
        ListNode prev = new ListNode();
        ListNode curr = new ListNode();
        ListNode next = new ListNode();

        prev = head;
        curr = head.next;
        next = curr.next;
        prev.next = null;

        while (next != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
        }
        curr.next = prev;


        return curr;

    }
}
