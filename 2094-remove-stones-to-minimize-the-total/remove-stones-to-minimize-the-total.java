class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        int sum = 0;

        for (int pile : piles) {
            pq.add(pile);
        }

        while (k-- > 0) {
            int top = pq.poll();
            pq.offer((top + 1) / 2); // ceil(top/2)
        }

        while (!pq.isEmpty()) {
            sum += pq.poll();
        }

        return sum;
    }
}