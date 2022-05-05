class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
Queue<Integer> q2 = new LinkedList<>();
    int size;

    public MyStack() {
        this.size=0;
        
    }
    
    public void push(int x) {
        size++;
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.peek());
                q1.remove();
        }
        Queue<Integer> temp = new LinkedList<>();
        temp=q1;
        q1=q2;
        q2=temp;
        
    }
    
    public int pop() {
        if(q1.isEmpty()){
            return -1;
        }
       
             int h= q1.remove();
            size--;
        
        return h;
      
        
    }
    
    public int top() {
        if(q1.isEmpty())
            return -1;
        else
           return q1.peek();
        
    }
    
    public boolean empty() {
        return q1.isEmpty();
        
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