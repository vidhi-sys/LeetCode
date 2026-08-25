class Solution {
    public int missingMultiple(int[] nums, int k) {
        int ans=0;
        HashSet<Integer>set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);

        }

        for(int j=k;j<=k*100+1;j+=k){
            if(!set.contains(j)){
                ans=j;
                break;
            }
        }
        if(k==1&&nums.length==1){
            ans=1;
        }
        return ans;
        
    }
}