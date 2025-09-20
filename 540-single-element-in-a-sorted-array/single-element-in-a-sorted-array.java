class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // Check which side the single element is on
            if (mid % 2 == 0) {
                // Even index: should be first element of a pair
                if (nums[mid] == nums[mid + 1]) {
                    left = mid + 2; // search right
                } else {
                    right = mid; // search left (including mid)
                }
            } else {
                // Odd index: should be second element of a pair
                if (nums[mid] == nums[mid - 1]) {
                    left = mid + 1; // search right
                } else {
                    right = mid - 1; // search left
                }
            }
        }
        
        return nums[left];
    }
}