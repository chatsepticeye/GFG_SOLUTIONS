class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++){
            int n=arr.length;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }
}