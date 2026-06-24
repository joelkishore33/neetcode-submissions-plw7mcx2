class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> joel = new Stack<>();
        int val = 0;

        for (int i = 0; i < tokens.length; i++){
            if (!(tokens[i].equals("+")) && !(tokens[i].equals("-")) && !(tokens[i].equals("*")) && !(tokens[i].equals("/"))){
                int num = Integer.parseInt(tokens[i]);
                joel.push(num);
            }
            else if(tokens[i].equals("+")){
                int x = joel.pop();
                int y = joel.pop();
                int z = x + y;
                joel.push(z);
            }
            else if(tokens[i].equals("-")){
                int x = joel.pop();
                int y = joel.pop();
                int z = y - x;
                joel.push(z);
            }
            else if (tokens[i].equals("*")){
                int x = joel.pop();
                int y = joel.pop();
                int z = y * x;
                joel.push(z);
            }
            else if (tokens[i].equals("/")){
                int x = joel.pop();
                int y = joel.pop();
                int z = y / x;
                joel.push(z);
            }
        }
        int mike = joel.pop();

        return mike;

    }
}
