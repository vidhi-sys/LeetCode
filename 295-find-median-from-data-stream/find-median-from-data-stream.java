class MedianFinder {

    PriorityQueue<Integer> pq;   // max heap
    PriorityQueue<Integer> pq2;  // min heap

    public MedianFinder() {
        pq = new PriorityQueue<>(Collections.reverseOrder());
        pq2 = new PriorityQueue<>();
    }

    public void addNum(int num) {

        // Insert into appropriate heap
        if (pq.isEmpty() || num <= pq.peek()) {
            pq.offer(num);
        } else {
            pq2.offer(num);
        }

        // Balance heaps
        if (pq.size() > pq2.size() + 1) {
            pq2.offer(pq.poll());
        } else if (pq2.size() > pq.size() + 1) {
            pq.offer(pq2.poll());
        }
    }

    public double findMedian() {

        if (pq.size() == pq2.size()) {
            return ((double)pq.peek() + pq2.peek()) / 2.0;
        }

        return (pq.size() > pq2.size()) ? pq.peek() : pq2.peek();
    }
}