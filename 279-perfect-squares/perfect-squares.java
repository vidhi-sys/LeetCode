class Solution {
    public boolean issqrt(int n){
        int sqrt=(int)Math.sqrt(n);
        return sqrt*sqrt==n;
    }
     public int squares(int n,int[]dp) {
        if(issqrt(n)) return 1;
       if(dp[n]!=-1)return dp[n];
       int min=Integer.MAX_VALUE;
       for(int i=1;i*i<=n;i++){
        int count=squares(i*i,dp)+squares(n-i*i,dp);
        min=Math.min(count,min);
       }
       return dp[n]=min;
        
    }
    public int numSquares(int n) {
       
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        return squares(n,dp);
        
    }
}