class MinStack {

    private Stack<Integer> joel;
    private Stack<Integer> min;

    public MinStack() {
        joel = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        joel.push(val);
        if (min.empty()){
            min.push(val);
        }
        else if(min.peek() >= joel.peek()){
            min.push(val);
        }
    }
    
    public void pop() {
        if (joel.peek().equals(min.peek())){
            min.pop();
        }
        joel.pop();
    }
    
    public int top() {
        return joel.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}