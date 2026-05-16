class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        char[] chars = s.toCharArray();
        
        for(char c : chars) {
            // If current character is a digit
            if(Character.isDigit(c)) {
                // Remove the previous character from stack
                if(!st.isEmpty()) {
                    st.pop();
                }
            } else {
                // If it's a letter, push it to stack
                st.push(c);
            }
        }
        
        // Build result string from stack
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
        
        // Reverse because stack is LIFO
        return sb.reverse().toString();
    }
}