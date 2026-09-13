class Solution {
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
    public int longestPalindromeSubseq(String s) {
       StringBuilder a = new StringBuilder(s);

        StringBuilder b = new StringBuilder(s);
        b.reverse();
        int n=s.length();
        int[][]dp= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return solve(n-1,n-1,a,b,dp);
        
        
    }
}