class Solution {

    public boolean dfs(int course,
                       ArrayList<ArrayList<Integer>> graph,
                       boolean[] vis,
                       boolean[] path,
                       ArrayList<Integer> ans) {

        // cycle
        if (path[course]) {
            return false;
        }

        // already processed
        if (vis[course]) {
            return true;
        }

        vis[course] = true;
        path[course] = true;

        for (int next : graph.get(course)) {
            if (!dfs(next, graph, vis, path, ans)) {
                return false;
            }
        }

        path[course] = false;

        // TOPological sort
        ans.add(course);

        return true;
    }

    public boolean canFinish(int n, int[][] courses) {

        ArrayList<Integer> ans = new ArrayList<>();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // prerequisite -> course
        for (int[] c : courses) {
            graph.get(c[1]).add(c[0]);
        }

        boolean[] vis = new boolean[n];
        boolean[] path = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (!vis[i]) {

                if (!dfs(i, graph, vis, path, ans)) {
                    return false;
                }
            }
        }

        return true;
    }
}