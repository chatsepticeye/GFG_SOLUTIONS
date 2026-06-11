/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        if(head.next==null) return head;
        Node a=head.next;
        head.next=null;
        Node  b=reverseList(a);
        a.next=head;
        return b;
        
    }
}