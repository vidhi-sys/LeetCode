class Solution {
    public boolean solve(int i,int[]nums,int target,int[][]dp){
        if(i==nums.length){
            if(target==0){
                return true;
            }
            else{
                return false;
            }
        }
        if(dp[i][target]!=-1){
            return dp[i][target]==1;
            //means set it as true;
        }
        boolean flag=false;
        boolean skip=solve(i+1,nums,target,dp);
        //boolean pick=solve(i+1,nums,target-nums[i],dp);
        if(target-nums[i]<0){
            flag=skip;
        }else{
                boolean pick=solve(i+1,nums,target-nums[i],dp);
                flag=pick||skip;

        }
        dp[i][target]=(flag) ? 1 : 0;
        return flag;

    }
    public boolean canPartition(int[] nums){
        int n=nums.length;
        int sum=0;
        for(int ele:nums){
            sum+=ele;        }
            if(sum%2!=0){
                return false;
            }
            int[][]dp= new int[n][(sum/2)+1];
            for(int i=0;i<n;i++){
                for(int j=0;j<=sum/2;j++){
                    dp[i][j]=-1;
                }
            }
        return solve(0,nums,sum/2,dp);
    }
}