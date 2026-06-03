class Solution {

    // 1. The Recursive Function
    void mergeSort(int arr[], int l, int r) {
        // Base Case: Stop recursion when the partition has 1 or 0 elements
        if (l < r) {
            int mid = l + (r - l) / 2;

            // Sort left half: l to mid (Corrected from mid + 1)
            mergeSort(arr, l, mid); 
            
            // Sort right half: mid + 1 to r
            mergeSort(arr, mid + 1, r);

            // Merge the sorted halves together
            merge(arr, l, mid, r);
        }
    }

    // 2. The Helper Merge Function (Separated cleanly)
    void merge(int a[], int l, int m, int r) {
        // Use the parameters passed into the method header (m instead of mid)
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        // Declare loop variables properly
        for (int i = 0; i < n1; i++) {
            L[i] = a[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = a[m + 1 + j]; // Fixed: Changed R[i] to R[j]
        }

        int i = 0;
        int j = 0;
        int k = l;

        // Compare and merge elements back into the main array
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) { // Added '=' to maintain sorting stability
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements of L[]
        while (i < n1) {
            a[k] = L[i];
            k++;
            i++;
        }

        // Copy any remaining elements of R[]
        while (j < n2) { // Fixed: Changed n1 to n2
            a[k] = R[j];
            k++;
            j++;
        }
    }
}