class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == 'i') {
                // Reverse everything built so far
                sb.reverse();
            } else {
                // Just add the character
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}