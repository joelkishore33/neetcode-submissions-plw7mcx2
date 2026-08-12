/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if (head == null){
            return null;
        }
        
        Node dummy = new Node(0);
        Node joel = dummy;
        Node sandy = dummy;
        Node jason = head;
        HashMap<Node, Node> mike = new HashMap<>();

        while(jason != null){
            Node temp = new Node(jason.val);
            mike.put(jason, temp);

            dummy.next = temp;
            dummy = dummy.next;
            jason = jason.next;
        }

        joel = joel.next;

        while(head != null){
            if (head.random != null){
                joel.random = mike.get(head.random);
            }
            joel = joel.next;
            head = head.next;

        }

        return sandy.next;

    }
}
