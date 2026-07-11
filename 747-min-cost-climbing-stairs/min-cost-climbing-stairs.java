import java.util.Arrays;

class Solution {
    int[] dp;

    public int climb(int i, int[] cost) {
        if (i >= cost.length) {
            return 0;
        }

        if (dp[i] != Integer.MAX_VALUE) {
            return dp[i];
        }

        dp[i] = cost[i] + Math.min(climb(i + 1, cost), climb(i + 2, cost));

        return dp[i];
    }

    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp, Integer.MAX_VALUE);

        return Math.min(climb(0, cost), climb(1, cost));
    }
}