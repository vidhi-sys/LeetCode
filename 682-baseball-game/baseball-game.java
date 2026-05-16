class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        
        for(String op : operations) {
            if(op.equals("+")) {
                // Sum of last two scores
                int last = st.pop();
                int secondLast = st.peek();
                st.push(last);
                st.push(last + secondLast);
            }
            else if(op.equals("D")) {
                // Double the last score
                st.push(2 * st.peek());
            }
            else if(op.equals("C")) {
                // Remove the last score
                st.pop();
            }
            else {
                // It's a number, parse and push
                st.push(Integer.parseInt(op));
            }
        }
        
        // Sum all remaining scores
        int sum = 0;
        while(!st.isEmpty()) {
            sum += st.pop();
        }
        
        return sum;
    }
}