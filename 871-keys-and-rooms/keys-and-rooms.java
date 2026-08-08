class Solution {
    public void dfs(int start, List<List<Integer>> rooms,boolean[]vis){
    vis[start]=true;
    for(int ele:rooms.get(start)){
        if(!vis[ele]){
            dfs(ele,rooms,vis);
        }
    }    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[]vis= new boolean[n];
        // initially false hai
        vis[0]=true;
        dfs(0,rooms,vis);
        //0th room key is always there with us
      /*  Queue<Integer> q= new LinkedList<>();
        q.add(0);
        while(q.size()>0){
            int top=q.remove();
            for(int ele:rooms.get(top)){
                if(vis[ele]==false){
                    q.add(ele);
                    vis[ele]=true;
                }

            }
            
        }*/


        for(boolean ele:vis){

if(ele== false){
    return false;
}
        }
        return true;
    }
}