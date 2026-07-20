class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int gcd=Integer.MIN_VALUE;
        int smallest=nums[0];
        int largest=nums[nums.length-1];
        for(int i=1;i<=largest;i++){
            if((smallest%i==0)&&(largest%i==0)){
                gcd=Math.max(gcd,i);
            }
            
        }
        return gcd;
        
    }
}