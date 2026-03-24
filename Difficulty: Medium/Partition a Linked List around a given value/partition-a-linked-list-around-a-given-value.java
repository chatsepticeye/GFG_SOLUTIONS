
class Solution {
    public static Node partition(Node head, int x) {
        // Your code here
       
        Node d1=new Node(-1);
        Node d2=new Node(-1);
        Node d3=new Node(-1);
        Node t1=d1;
        Node t2=d2;
        Node t3=d3;
        Node t=head;
        while(t!=null){
            if(t.data<x){
                t1.next=t;
                t1=t1.next;
                
            }
            else if(t.data==x){
                t3.next=t;
                t3=t3.next;
            }
            else{
                t2.next=t;
                t2=t2.next;
            }
            t=t.next;
            
        }
        t2.next=null;
        t1.next=d3.next;
        t3.next=d2.next;
        return d1.next;
        
    }
}