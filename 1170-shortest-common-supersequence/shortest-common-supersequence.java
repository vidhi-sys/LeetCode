class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        StringBuilder lcs = new StringBuilder();
        int n1 = str1.length();
        int n2 = str2.length();

        int[][] dp = new int[n1 + 1][n2 + 1];

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {

                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        int i = n1;
        int j = n2;

        while (i > 0 && j > 0) {

            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                lcs.append(str1.charAt(i - 1));
                i--;
                j--;
            }
            else {
                if (dp[i - 1][j] > dp[i][j - 1]) {
                    i--;
                }
                else {
                    j--;
                }
            }
        }

        String answer = "";
        i = 0;
        j = 0;
        int k = lcs.length() - 1;

        while (i < n1 && j < n2 && k >= 0) {

            if (str1.charAt(i) == str2.charAt(j) &&
                str2.charAt(j) == lcs.charAt(k)) {

                answer += lcs.charAt(k);
                i++;
                j++;
                k--;
            }
            else {

                while (i < n1 && str1.charAt(i) != lcs.charAt(k)) {
                    answer += str1.charAt(i);
                    i++;
                }

                while (j < n2 && str2.charAt(j) != lcs.charAt(k)) {
                    answer += str2.charAt(j);
                    j++;
                }
            }
        }

        while (i < n1) {
            answer += str1.charAt(i);
            i++;
        }

        while (j < n2) {
            answer += str2.charAt(j);
            j++;
        }

        return answer;
    }
}