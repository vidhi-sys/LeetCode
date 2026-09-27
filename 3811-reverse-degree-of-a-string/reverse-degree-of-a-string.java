class Solution {
    public int reverseDegree(String s) {
        HashMap<Character,Integer> mp= new HashMap<>();
        int value=1;
        for(char ch ='z';ch>='a';ch--){
            mp.put(ch,value);
            value++;
        }
        int res=0;
        char[]charray=s.toCharArray();
        for(int i=0;i<charray.length;i++){
                char c= charray[i];
                int key=mp.get(c);
                res+=(i+1)*key;

        }
        return res;
        
    }
}