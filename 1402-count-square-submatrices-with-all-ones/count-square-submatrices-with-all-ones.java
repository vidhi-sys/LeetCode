class Solution {
    public int countSquares(int[][] arr) {
        int count=0;
        int m=arr.length;
        int n=arr[0].length;
        int[][]dp= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i>0&&j>0){
                if(arr[i][j]==1){
                    arr[i][j]+=Math.min(arr[i-1][j],Math.min(arr[i][j-1],arr[i-1][j-1]));
                   
                }
                
                }
                count+=arr[i][j];
            }
        }
        return count;
    }
}