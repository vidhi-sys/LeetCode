class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                if (i == j) {
                    dp[j][i] = 1;
                    count++;
                }

                else if (i == j + 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[j][i] = 1;
                        count++;
                    }
                }

                else {
                    if (s.charAt(i) == s.charAt(j)) {
                        if (dp[j + 1][i - 1] == 1) {
                            dp[j][i] = 1;
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }
}