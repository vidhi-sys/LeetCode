class Solution {
    public int countPairs(List<Integer> nums, int target) {
        
        int n = nums.size();
        int[] arr = new int[n];

        // Convert List<Integer> to int[]
        for (int i = 0; i < n; i++) {
            arr[i] = nums.get(i);
        }
        Arrays.sort(arr);

        

        int i = 0, j = n - 1;
        int count = 0;

        while (i < j) {
            if (arr[i] + arr[j] < target) {
                count+=j-i;
                i++;
            } else{
                j--;
            }
        }

        return count;
    }
}
