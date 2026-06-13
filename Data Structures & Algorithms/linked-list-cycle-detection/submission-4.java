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
    public boolean hasCycle(ListNode head) {
        ListNode one = new ListNode();
        ListNode two = new ListNode();
        one = head;
        if (one == null || one.next == null){
            return false;
        }

        two = head.next;

        if (two.next == null){
            return false;
        }

        while(two.next != null && two.next.next != null){
            if (two == one){
                return true;
            }
            else{
                one = one.next;
                two = two.next.next;
            }
        }

        return false;
    }
}
