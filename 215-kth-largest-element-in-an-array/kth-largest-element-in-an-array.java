class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heapp = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:nums){
            
        heapp.add(ele);

        }
        for(int i=0;i<k-1;i++){
            heapp.remove();
        }
        return heapp.peek();
        
    }
}