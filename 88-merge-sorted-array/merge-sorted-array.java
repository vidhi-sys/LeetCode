class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<m;i++){
            
                 minHeap.add(nums1[i]);
            
        }
        for(int i:nums2){
            minHeap.add(i);
        }
        for(int i=0;i<m+n;i++){
            nums1[i]=minHeap.poll();


            
        }

        
    }
}