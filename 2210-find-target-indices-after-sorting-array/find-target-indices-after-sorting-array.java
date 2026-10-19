class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> lis = new  ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                lis.add(i);
            }
        }
        return lis;
        
    }
}