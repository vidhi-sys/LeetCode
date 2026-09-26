import java.util.*;

class triplet implements Comparable<triplet> {
    int node;
    int parent;
    int weight;

    triplet(int node, int parent, int weight) {
        this.node = node;
        this.parent = parent;
        this.weight = weight;
    }

    public int compareTo(triplet t) {
        if (this.weight == t.weight) {
            return Integer.compare(this.node, t.node);
        }
        return Integer.compare(this.weight, t.weight);
    }
}

class Solution {

    public int minCostConnectPoints(int[][] points) {

        int n = points.length;
        int sum = 0;

        PriorityQueue<triplet> pq = new PriorityQueue<>();
        boolean[] vis = new boolean[n];

        // Start from node 0
        pq.add(new triplet(0, -1, 0));

        while (pq.size() > 0) {

            triplet top = pq.remove();

            int node = top.node;
            int parent = top.parent;
            int weight = top.weight;

            // Already included in MST
            if (vis[node]) {
                continue;
            }

            // Include this node
            vis[node] = true;
            sum += weight;

            // Add edges to all unvisited nodes
            for (int i = 0; i < n; i++) {

                if (i == node || i == parent) {
                    continue;
                }

                if (vis[i]) {
                    continue;
                }

                int x1 = points[node][0];
                int y1 = points[node][1];

                int x2 = points[i][0];
                int y2 = points[i][1];

                // Manhattan distance
                int distance = Math.abs(x2 - x1) + Math.abs(y2 - y1);

                pq.add(new triplet(i, node, distance));
            }
        }

        return sum;
    }
}