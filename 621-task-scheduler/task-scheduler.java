class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        // Count frequencies
        for (char ch : tasks) {
            freq[ch - 'A']++;
        }

        // Max Heap
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                pq.offer(freq[i]);
            }
        }

        int time = 0;

        while (!pq.isEmpty()) {

            int cycle = n + 1;

            List<Integer> store = new ArrayList<>();

            int taskCount = 0;

            while (cycle > 0 && !pq.isEmpty()) {

                int currentFreq = pq.poll();

                if (currentFreq > 1) {
                    store.add(currentFreq - 1);
                }

                taskCount++;
                cycle--;
            }

            for (int remainingFreq : store) {
                pq.offer(remainingFreq);
            }

            if (pq.isEmpty()) {
                time += taskCount;
            } else {
                time += n + 1;
            }
        }

        return time;
    }
}