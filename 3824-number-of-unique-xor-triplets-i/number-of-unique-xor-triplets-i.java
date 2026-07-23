class Solution {
    public int uniqueXorTriplets(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer>set=new HashSet<>();
       
       int n=nums.length;
       if(n<=2){
        return n;
       }
    
      int m=0;
      for(int i:nums){
        m|=i;
      }
return m+1;
        
        
    }
}