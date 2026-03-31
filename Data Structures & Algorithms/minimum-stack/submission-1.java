class MinStack {
    Stack<Integer> joel = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
    }
    
    public void push(int val) {
        joel.push(val);
        if (min.isEmpty() || min.peek() >= val){
            min.push(val);
        }
    }
    
    public void pop() {
        if (joel.peek().equals(min.peek())) {
            min.pop();
        }
        joel.pop();
    }
    
    public int top() {
        int x = joel.peek();
        return x;
    }
    
    public int getMin() {
        return min.peek();
    }

}
