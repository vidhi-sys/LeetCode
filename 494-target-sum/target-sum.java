class Solution {
    static int sum;

    public int solve(int i, int[] nums, int target, int[][] dp) {

        // target went outside possible range
        if (target > sum || target < -sum) {
            return 0;
        }

        if (i == nums.length) {
            return target == 0 ? 1 : 0;
        }

        if (dp[i][target + sum] != -1) {
            return dp[i][target + sum];
        }

        int add = solve(i + 1, nums, target - nums[i], dp);
        int sub = solve(i + 1, nums, target + nums[i], dp);

        return dp[i][target + sum] = add + sub;
    }

    public int findTargetSumWays(int[] nums, int target) {

        sum = 0;

        for (int x : nums) {
            sum += x;
        }

        if (target > sum || target < -sum) {
            return 0;
        }

        int[][] dp = new int[nums.length][2 * sum + 1];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= 2 * sum; j++) {
                dp[i][j] = -1;
            }
        }

        return solve(0, nums, target, dp);
    }
}