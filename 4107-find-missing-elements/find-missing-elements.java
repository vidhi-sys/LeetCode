class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> missing = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            set.add(num);
        }

        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                missing.add(i);
            }
        }

        return missing;
    }
}