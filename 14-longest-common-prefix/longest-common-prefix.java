class Solution {
    public String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs);
    int n=strs.length;
    int max_len=strs[n-1].length();
    int min_len =strs[0].length();
    int common_len=Math.min(max_len,min_len);
    int i=0;
    while(i<common_len && strs[0].charAt(i)==strs[n-1].charAt(i)){
        i++;
    }


    return strs[0].substring(0,i);

        
    }
}