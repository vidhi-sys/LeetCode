class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set= new HashSet<>();
        int n=s.length();
        HashSet<String> set2= new HashSet<>();
        ArrayList<String> lis= new ArrayList<>();
        for(int i=0;i<=n-10;i++){
            String seen=s.substring(i,i+10);
            if(set.contains(seen)){
                set2.add(seen);
            }
            set.add(seen);
            
        }
        for(String ele: set2){
            lis.add(ele);
        }
        return lis;
    }
}