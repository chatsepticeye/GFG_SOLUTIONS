/*
     arr[] is the array
*/
class Solution {
    public static long product(long arr[]) {
        // your code here
        long p=1;
        int n=arr.length;
        long mod = 1000000007;
        for(int i=0;i<n;i++){
            p=(p*arr[i])%mod;
        }
        return p;
    }
}