
class Solution {

    public boolean dfs(int course, ArrayList<ArrayList<Integer>> graph, int[] vis) {

        // Currently visiting -> cycle found
        if (vis[course] == 1) {
            return true;
        }

        // Already completely processed
        if (vis[course] == 2) {
            return false;
        }

        // Mark as currently visiting
        vis[course] = 1;

        for (int next : graph.get(course)) {
            if (dfs(next, graph, vis)) {
                return true;
            }
        }

        // Mark as completely processed
        vis[course] = 2;

        return false;
    }

    public boolean canFinish(int n, int[][] courses) {

        // Create graph
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build graph
        for (int[] course : courses) {
            int a = course[0];
            int b = course[1];

            // b -> a
            graph.get(b).add(a);
        }

        int[] vis = new int[n];

        // Check every course
        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                if (dfs(i, graph, vis)) {
                    return false; // cycle exists
                }
            }
        }

        return true;
    }
}

