class Solution {

    public int solve(int i, List<Integer> nums, int target, int[][] dp) {

        // Target achieved
        if (target == 0) {
            return 0;
        }

        // No elements left
        if (i == nums.size()) {
            return -1000000;
        }

        if (dp[i][target] != -1) {
            return dp[i][target];
        }

        int pick = -1000000;

        if (nums.get(i) <= target) {
            pick = 1 + solve(i + 1, nums, target - nums.get(i), dp);
        }

        int skip = solve(i + 1, nums, target, dp);

        return dp[i][target] = Math.max(pick, skip);
    }

    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {

        int n = nums.size();

        int[][] dp = new int[n + 1][target + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                dp[i][j] = -1;
            }
        }

        int ans = solve(0, nums, target, dp);

        if (ans < 0) {
            return -1;
        }

        return ans;
    }
}