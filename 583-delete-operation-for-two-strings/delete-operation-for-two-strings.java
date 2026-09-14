class Solution {
    static int[][]dp;
    public int solve(int i,int j,StringBuilder s1, StringBuilder s2,int[][]dp) {
        if (i < 0 || j < 0) {
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if (s1.charAt(i) == s2.charAt(j)) {

            return dp[i][j]=1 + solve(i-1,j-1,s1,s2,dp);
        
        } else {

            return dp[i][j]= Math.max(solve(i-1 ,j,s1,s2,dp),solve(i ,j-1,s1,s2,dp)
            );
        }
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int n2 =text2.length();
        // sb's are pass by refrence rather than normal strings so better
        StringBuilder a= new StringBuilder(text1);
        StringBuilder b= new StringBuilder(text2);
        dp= new int[n][n2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n2;j++){
                dp[i][j]=-1;
            }
        }
        return solve(n-1,n2-1,a,b,dp);
    }
    public int minDistance(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        int n=Math.max(n1,n2);
       // int del1=n1-(longestCommonSubsequence(word1,word2));
       // int del2=n1-(longestCommonSubsequence(word1,word2));
        return n1+n2-2*longestCommonSubsequence(word1,word2);
        
    }
}