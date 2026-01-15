class Solution {
    public int appendCharacters(String s, String t) {
        int i=0;
        int j=0;
        int k=s.length();
        int m=t.length();
        int cnt=0;
        while(i<k&&j<m){
            if(s.charAt(i)==t.charAt(j)){
                cnt++;
                i++;
                j++;
            }
            else {
                i++;
                
            }
            
           

        }


            return Math.abs(m-j);
        
    }
}