class Solution {
    public int appendCharacters(String s, String t) {
        int i=0;
        int j=0;
        int k=s.length();
        int m=t.length();
        
        while(i<k&&j<m){
            if(s.charAt(i)==t.charAt(j)){
                
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