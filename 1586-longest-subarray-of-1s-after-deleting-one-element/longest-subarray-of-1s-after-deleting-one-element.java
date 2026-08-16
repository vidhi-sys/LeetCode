class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int j=0;
        int k=1;
        int max=0;
        while(j<nums.length){
            if(nums[j]==0){
                k--;
                
            }
           while(k<0){
            if(nums[i]==0){
                k++;
            }
            i++;
           }
           max= Math.max(max,j-i);
           j++;
        }
        return max;
    }
}