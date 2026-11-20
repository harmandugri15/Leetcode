class MinStack {
    Stack<Integer> st;
    Stack<Integer> minstack;

    public MinStack() {
        st=new Stack<>();
        minstack=new Stack();
    }
    
    public void push(int value) {
        st.push(value);
        if(!minstack.isEmpty()){
            if(value<=minstack.peek()){
                minstack.push(value);
            }
        }
        else{
            minstack.push(value);
        }
    }
    
    public void pop() {
        if(!st.isEmpty()){
            int a=st.pop();
            if(!minstack.isEmpty()){
                if(minstack.peek()==a){
                    minstack.pop();
                }
            }
            
        }

    }
    
    public int top() {
        if(!st.isEmpty()){
            return st.peek();
        }
        else{
            return -1;
        }
    }
    
    public int getMin() {
        if(!minstack.isEmpty()){
            return minstack.peek();
        }
        else{
            return -1;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */