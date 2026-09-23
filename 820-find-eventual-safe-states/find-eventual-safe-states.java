class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n= graph.length;
        List<List<Integer>> rev = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int[] indegree= new int[n];
        for(int i=0;i<n;i++){
            rev.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            for(int ele:graph[i]){
                rev.get(ele).add(i);
                indegree[i]++;
            }
        }
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(q.size()>0){
            int top=q.remove();
            ans.add(top);
            for(int ele: rev.get(top)){
                indegree[ele]--;
                if(indegree[ele]==0){
                    q.add(ele);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }}