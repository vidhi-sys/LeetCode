class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] temp = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }
        
        // Copy remaining elements from nums1
        while (i < m) {
            temp[k++] = nums1[i++];
        }
        
        // Copy remaining elements from nums2 (fixed the condition)
        while (j < n) {
            temp[k++] = nums2[j++];
        }
        
        int size = m + n;
        if (size % 2 == 1) {
            // Odd length: return middle element
            return temp[size / 2];
        } else {
            // Even length: return average of two middle elements
            return (temp[size / 2 - 1] + temp[size / 2]) / 2.0;
        }
    }
}