
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();

        int[][] dp = new int[n][n];

        int start = 0;
        int maxLen = 1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                if (i == j) {
                    dp[j][i] = 1;
                }

                else if (i == j + 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[j][i] = 1;
                    }
                }

                else {
                    if (s.charAt(i) == s.charAt(j) &&
                        dp[j + 1][i - 1] == 1) {
                        dp[j][i] = 1;
                    }
                }

                // If palindrome, check length
                if (dp[j][i] == 1) {
                    if (i - j + 1 > maxLen) {
                        maxLen = i - j + 1;
                        start = j;
                    }
                }
            }
        }

        return s.substring(start, start + maxLen);
    }
}
        
