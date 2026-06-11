/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        ArrayList<Integer>arr=new ArrayList<>();
        Node t=head;
        while(t!=null){
            arr.add(t.data);
            t=t.next;
        }
        int n=arr.size();
        int i=0;
        int j=n-1;
        while(i<=j){
            if(!arr.get(i).equals(arr.get(j))) return false;
            i++;
            j--;
        }
        return true;
        
    }
}