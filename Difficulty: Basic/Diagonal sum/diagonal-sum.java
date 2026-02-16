

class Solution {
    public int DiagonalSum(int[][] arr) {
        // code here
        int n= arr.length;
        int s=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) s+=+arr[i][j];
                if((i+j)==n-1) s+=arr[i][j];
            }
        }
        return s;
    }
}