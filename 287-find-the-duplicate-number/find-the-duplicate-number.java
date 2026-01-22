class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int ans=-1;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                ans=nums[i];
            }
            
                set.add(nums[i]);
            
        }
        return ans;
    }
}