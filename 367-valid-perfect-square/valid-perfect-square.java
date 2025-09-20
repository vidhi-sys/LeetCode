class Solution {
    public boolean isPerfectSquare(int num) {
       long i=0;
       long j=num;
       while(i<=j){
        long mid=i+(j-i)/2;
        if(mid*mid==num){
            return true;
        }
        else if(mid*mid<num){
            i=mid+1;
        }
        else{
            j=mid-1;
        }
       }
        return false;
    }
}