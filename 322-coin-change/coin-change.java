class Solution {
    public int solve(int i,int[]coins,int amount,int[][]dp){
       if (amount == 0) {
            return 0;
        }
        // FIX 2: Out of bounds check since we are moving forward (from 0 to coins.length)
        if (i >= coins.length) {
            return (int) 1e9;
        }
        
        if (dp[i][amount] != -1) {
            return dp[i][amount];
        }
        
        int pick = (int) 1e9;
        if (coins[i] <= amount) {
            pick = 1 + solve(i, coins, amount - coins[i], dp);
        }
        
        // FIX 3: Skip means moving to the next coin index (i + 1)
        int skip = solve(i + 1, coins, amount, dp);
       
        return dp[i][amount] = Math.min(pick, skip);
    }

    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount + 1];
        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j <= amount; j++) {
                dp[i][j] = -1;
            }
        }
        
        int result = solve(0, coins, amount, dp);
        
        // If the result is our infinity value, it means the amount cannot be formed
        return result >= (int) 1e9 ? -1 : result;
    }
}