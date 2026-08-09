class Solution {
    private int[][] memo;
    private int[] suffixSum;

    public int stoneGameII(int[] piles) {
        int n = piles.length;
        memo = new int[n][n + 1];
        suffixSum = new int[n];

        // Compute suffix sums
        suffixSum[n - 1] = piles[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + piles[i];
        }

        return solve(0, 1, piles);
    }

    private int solve(int i, int M, int[] piles) {
        int n = piles.length;
        
        // Base case: If current player can take all remaining piles
        if (i + 2 * M >= n) {
            return suffixSum[i];
        }

        if (memo[i][M] != 0) {
            return memo[i][M];
        }

        int maxStones = 0;
        for (int X = 1; X <= 2 * M; X++) {
            // Player takes X piles; opponent will optimally play from state (i + X, max(M, X))
            int opponentStones = solve(i + X, Math.max(M, X), piles);
            maxStones = Math.max(maxStones, suffixSum[i] - opponentStones);
        }

        return memo[i][M] = maxStones;
    }
}