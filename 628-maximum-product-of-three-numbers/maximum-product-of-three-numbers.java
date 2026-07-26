class Solution {
    public int maximumProduct(int[] nums) {
       
        int n=nums.length;
        int product=0;
        int product2=0;
       Arrays.sort(nums);
       product=nums[n-3]*nums[n-2]*nums[n-1];
       product2=nums[0]*nums[1]*nums[n-1];
        return Math.max(product,product2);
        
    }
}