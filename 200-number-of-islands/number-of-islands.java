class pair{
    int row;
    int col;
    pair(int row, int col){
        this.row=row;
        this.col=col;
    }
        
    }
class Solution {
    
   /* public void bfs(int i, int j, char[][] grid,boolean[][] vis){
        int n=grid.length;
        int m=grid[0].length;
        Queue<pair>q= new LinkedList<>();
        q.add(new pair(i,j));
        vis[i][j] = true;
        while(q.size()>0){
            pair top= q.remove();
            int row=top.row;
            int col=top.col;
            //top
            if(row>0){
            if((grid[row-1][col]=='1')&&(vis[row-1][col]==false)){
                pair p = new pair(row-1,col);
                q.add(p);
                vis[row-1][col]=true;

            }
        }
            //bottom
             if(row+1<n){
            if((grid[row+1][col]=='1')&&(vis[row+1][col]==false)){
                pair p = new pair(row+1,col);
                q.add(p);
                vis[row+1][col]=true;

            }
        }
        //left
             if(col>0){
            if((grid[row][col-1]=='1')&&(vis[row][col-1]==false)){
                pair p = new pair(row,col-1);
                q.add(p);
                vis[row][col-1]=true;

            }
        }
        //left
             if(col+1<m){
            if((grid[row][col+1]=='1')&&(vis[row][col+1]==false)){
                pair p = new pair(row,col+1);
                q.add(p);
                vis[row][col+1]=true;

            }
        }

        }
    }*/
    public void dfs(int i,int j, char[][] grid, boolean[][] vis){
       int m=grid[0].length;
        vis[i][j]=true;
        if(i-1>=0&&vis[i-1][j]==false){
            if(grid[i-1][j]=='1'){
        dfs(i-1,j,grid,vis);
            }
        }
        if(j-1>=0&&vis[i][j-1]==false){
            if(grid[i][j-1]=='1'){
        dfs(i,j-1,grid,vis);
            }
        }
        if(i+1<grid.length&&vis[i+1][j]==false){
            if(grid[i+1][j]=='1'){
        dfs(i+1,j,grid,vis);
            }
        }
        if(j+1<m&&vis[i][j+1]==false){
            if(grid[i][j+1]=='1'){
        dfs(i,j+1,grid,vis);
            }
        }

    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][]vis= new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'&&vis[i][j]==false){
                    dfs(i,j,grid,vis);
                    count++;
                }
            }
        }
       return count;
        
    }
}