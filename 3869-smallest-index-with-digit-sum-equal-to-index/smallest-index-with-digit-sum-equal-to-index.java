class Solution {
    public int smallestIndex(int[] nums) {
        int idx = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }

            if (sum == i) {
                idx = Math.min(idx, i);
            }
        }

        if (idx == Integer.MAX_VALUE) {
            return -1;
        }

        return idx;
    }
}