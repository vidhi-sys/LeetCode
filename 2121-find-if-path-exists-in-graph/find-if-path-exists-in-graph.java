class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        if(source==destination){
            return true;
        }
    for (int i = 0; i < n; i++){
        graph.add(new ArrayList<>());
        }

    for (int[] edge : edges) {
        // edges only has 2 indices oth and 1st index
        graph.get(edge[0]).add(edge[1]);
        graph.get(edge[1]).add(edge[0]);
}
boolean[]vis= new boolean[n];
 vis[source]=true;

Queue<Integer> q= new LinkedList<>();
q.add(source);
while(!q.isEmpty()){
    int top=q.poll();
    for(int ele: graph.get(top)){
        if(vis[ele]==false){
            q.add(ele);
            vis[ele]=true;
            if(ele==destination) return true;
        }
    }
}
for(boolean ele:vis){
    if(ele==false){
        return false;
    }
}
return true;
    }
}