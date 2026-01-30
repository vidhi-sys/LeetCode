class Solution {

    public int countGoodSubstrings(String s) {
        int n=s.length();
        int k=0;
        for(int i=0;i+2<n;i++){
            if(s.charAt(i)!=s.charAt(i+1)&&s.charAt(i+2)!=s.charAt(i+1)&&s.charAt(i)!=s.charAt(i+2)){
k++;
            }



        }
        return k;
        
    }
}