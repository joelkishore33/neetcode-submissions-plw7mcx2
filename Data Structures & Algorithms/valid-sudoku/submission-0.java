class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character, Integer> joel = new HashMap<>();

        for (int j = 0; j < board[0].length; j++){
            for(int i = 0; i < board.length; i++){
                int curr = 0;
                if (board[j][i] != '.'){
                    if (!joel.containsKey(board[j][i])){
                        joel.put(board[j][i], 1);
                    }
                    else{
                        return false;
                    }
                }
            }
            joel.clear();
        }
        joel.clear();
        
        
        for (int j = 0; j < board.length; j++){
            for(int i = 0; i < board[0].length; i++){
                int curr = 0;
                if (board[i][j] != '.'){
                    if (!joel.containsKey(board[i][j])){
                        joel.put(board[i][j], 1);
                    }
                    else{
                        return false;
                    }
                }
            }
            joel.clear();
        }
        int count = 0;
        int count1 = 0;
        int x = 0;

        while (count1 < board.length){
            while (count < board.length){
                joel.clear();
                for (int i = x + count1; i < x + count1 + 3; i++){
                    for (int j = x + count; j < x + count + 3; j++){
                        if (board[i][j] != '.'){
                            if (!joel.containsKey(board[i][j])){
                                joel.put(board[i][j], 1);
                            }
                            else{
                                return false;
                            }
                        }
                    }
                }
                count += 3;
            }
            count1 += 3;
        }
        

        return true;
    }
}
