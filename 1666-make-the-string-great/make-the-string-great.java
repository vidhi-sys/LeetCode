class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int n = sb.length();
            
            // If the stack isn't empty and the current char reacts with the last char
            if (n > 0 && Math.abs(sb.charAt(n - 1) - c) == 32) {
                // Remove the last character (they cancel each other out)
                sb.deleteCharAt(n - 1);
            } else {
                // Otherwise, add the current character to our "good" string
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}