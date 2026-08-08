class Solution {
    public void bfs(int i, boolean[]vis,int[][] isConnected){
        vis[i]=true;
        int n=isConnected.length;
        Queue<Integer>q= new LinkedList<>();
        q.add(i);
          while(q.size()>0){
            int front=q.remove();// remove front elemeent
            // add ele connected to front by adj matrix
                 for(int j=0;j<n;j++){
                    // basically check ki front se konse elements connected h
                    if(isConnected[front][j]==1&&vis[j]==false){
                        q.add(j);
                        vis[j]=true;
                    }
                }}}
public void dfs(int i, boolean[]vis,int[][] isConnected){
        vis[i]=true;
        int n=isConnected.length;
        vis[i]=true;
                 for(int j=0;j<n;j++){
                    
                    if(isConnected[i][j]==1&&vis[j]==false){
                        dfs(j,vis,isConnected);
                    }
                }}
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] vis= new boolean[n];
       // initial value of boolean array remains false only 
         int count=0;
         for(int i=0;i<n;i++){
            if(!vis[i]){
                //apply bfs
                dfs(i,vis,isConnected);
                count++; }}
        return count;
    }
}