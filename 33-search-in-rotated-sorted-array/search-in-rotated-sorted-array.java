class Solution {
    public static int pivot(int []nums){
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int mid=i+(j-i)/2;
            if(nums[mid]>nums[j]){
                i=mid+1;
            }
            else{
                j=mid;
            }
        }
        return i;
    }
    public static int leftBS(int []nums,int target,int pivot){
        int i=0;
        int j=pivot-1;
        
        while(i<=j){
            int mid=i+(j-i)/2;
            if( nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return-1;
        
    }
     public static int rightBS(int []nums,int target,int pivot){
        int i=pivot;
        int j=nums.length-1;
        int ans=-1;
        while(i<=j){
             int mid = i + (j - i) / 2;
            if( nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return -1;
        
    }
    public int search(int[] nums, int target) {
        int pivot=pivot(nums);
         int rightResult = rightBS(nums, target, pivot);
        if (rightResult != -1) {
            return rightResult;
        }
        
        int leftResult = leftBS(nums, target, pivot);
        return leftResult;
        
    }
}