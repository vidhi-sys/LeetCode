class MyStack {
    Queue<Integer> q= new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
        
    }
    
    public int pop() {
        int i=0;
        while(i<q.size()-1){
            q.add(q.remove());
            i++;
        }
        
        return q.remove();
    }
    
    public int top() {
        int i=0;
        while(i<q.size()-1){
        
            q.add(q.remove());
            i++;
        }
        int p= q.peek();
        q.add(q.remove());
        return p;
    }
    
    public boolean empty() {
        if(q.size()==0){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */