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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        ListNode dummy1 = head;
        ListNode dummy2 = head;
        int size = 0;
        if (head == null){
            return head;
        }
        else if (head.next == null){
            return null;
        }

        while(dummy2 != null){
            size++;
            dummy2 = dummy2.next;
        }
        int target = size - n;
        int count = 1;
        if (target == 0){
            dummy.next = head.next;
            dummy = dummy.next;
            return dummy;
        }
        while (count != target){
            head = head.next;
            count++;
        }
        head.next = head.next.next;
        return dummy1;

    }
}
