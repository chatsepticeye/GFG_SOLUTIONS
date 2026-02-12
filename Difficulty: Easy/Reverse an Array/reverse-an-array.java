class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int t=arr[left];
            arr[left]=arr[right];
            arr[right]=t;
            left++;
            right--;
            
        }
    }
}