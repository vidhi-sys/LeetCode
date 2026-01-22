class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int slow = i, fast = i;
            boolean forward = nums[i] > 0;

            while (true) {
                slow = next(nums, slow, forward);
                fast = next(nums, fast, forward);
                if (fast != -1) {
                    fast = next(nums, fast, forward);
                }

                if (slow == -1 || fast == -1) break;

                if (slow == fast) {
                    if (slow == next(nums, slow, forward)) break;
                    return true;
                }
            }
        }
        return false;
    }

    private int next(int[] nums, int idx, boolean forward) {
        boolean dir = nums[idx] > 0;
        if (dir != forward) return -1;

        int n = nums.length;
        int next = ((idx + nums[idx]) % n + n) % n;
        return next;
    }
}
