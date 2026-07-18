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
    public void reorderList(ListNode head) {

        ListNode dummy = head;
        ListNode jason = head;
        Stack<ListNode> joel = new Stack<>();

        while(dummy != null){
            joel.push(dummy);
            dummy = dummy.next;
        }

        int x = joel.size();
        int count = 0;

        if (x % 2 == 1){
            while(count < x / 2){
                ListNode temp = head.next;
                head.next = joel.pop();
                head = head.next;
                head.next = temp;
                head = head.next;
                count++;
            }
            head.next = null;
        }
        else{
            while(count < (x / 2) - 1){
                ListNode temp = head.next;
                head.next = joel.pop();
                head = head.next;
                head.next = temp;
                head = head.next;
                count++;
            }
            head = head.next;
            head.next = null;
        }


    }
}