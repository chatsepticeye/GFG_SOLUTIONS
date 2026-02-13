import java.util.Arrays;

class Solution {
    public long solve(int[] arr, int n) {
        // Step 1: Sort the array (This makes it fast: O(N log N))
        Arrays.sort(arr);
        
        long count = 0;
        int right = 0;
        
        // Step 2: Use Two Pointers logic
        // For each number (left), find how many numbers are strictly bigger (right)
        for (int i = 0; i < n; i++) {
            // Move 'right' pointer until we find a number strictly bigger than arr[i]
            while (right < n && arr[right] <= arr[i]) {
                right++;
            }
            // All numbers from 'right' to the end are valid pairs
            count += (n - right);
        }
        
        return count;
    }
}