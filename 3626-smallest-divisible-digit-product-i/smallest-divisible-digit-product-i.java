class Solution {
    public int smallestNumber(int n, int t) {
        int ans=0;
        for(int i=1;i<=100;i++){
             
        int num=n;
        int product=1;

        while(num!=0){
            int j=num%10;
            product=product*j;
            num=num/10;
        }
        if(product%t==0){
            ans=n;
            break;

        }else{
            n=n+1;

        }

        }
        return ans;
        
    }
}