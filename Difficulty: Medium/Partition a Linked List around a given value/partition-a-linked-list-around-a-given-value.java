class Solution {
    public Node partition(Node head, int x) {
        // Create 3 dummy nodes
        Node d1 = new Node(-1); // For LESS THAN x
        Node d2 = new Node(-1); // For EQUAL TO x
        Node d3 = new Node(-1); // For GREATER THAN x
        
        Node t1 = d1;
        Node t2 = d2;
        Node t3 = d3;
        Node t = head;
        
        while (t != null) {
            if (t.data < x) {
                t1.next = t;
                t1 = t1.next;
            } else if (t.data == x) { // Track elements equal to x separately
                t2.next = t;
                t2 = t2.next;
            } else {
                t3.next = t;
                t3 = t3.next;
            }
            t = t.next;
        }
        
        // Step 1: Terminate the very last list to avoid cycles
        t3.next = null;
        
        // Step 2: Chain all 3 lists together carefully
        t1.next = d2.next; // Less list points to Equal list
        t2.next = d3.next; // Equal list points to Greater list
        
        // Handle cases where the Equal list might be empty
        if (d2.next == null) {
            t1.next = d3.next;
        }
        
        return d1.next;
    }
}