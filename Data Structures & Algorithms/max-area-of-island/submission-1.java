class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        Stack<int[]> joel = new Stack<>();
        int row = grid.length;
        int col = grid[0].length;

        int currmax = 0;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (grid[i][j] == 1){
                    joel.push(new int[]{i, j});
                    grid[i][j] = 2;
                    currmax++;
                    while(joel.size() != 0){
                        int[] mike = joel.pop();
                        if (mike[0] - 1 >= 0 && grid[mike[0] - 1][mike[1]] == 1){
                            joel.push(new int[]{mike[0] - 1, mike[1]});
                            grid[mike[0] - 1][mike[1]] = 2;
                            currmax++;
                        }
                        if (mike[0] + 1 < row && grid[mike[0] + 1][mike[1]] == 1){
                            joel.push(new int[]{mike[0] + 1, mike[1]});
                            grid[mike[0] + 1][mike[1]] = 2;
                            currmax++;
                        }
                        if (mike[1] - 1 >= 0 && grid[mike[0]][mike[1] - 1] == 1){
                            joel.push(new int[]{mike[0], mike[1] - 1});
                            grid[mike[0]][mike[1] - 1] = 2;
                            currmax++;
                        }
                        if (mike[1] + 1 < col && grid[mike[0]][mike[1] + 1] == 1){
                            joel.push(new int[]{mike[0], mike[1] + 1});
                            grid[mike[0]][mike[1] + 1] = 2;
                            currmax++;
                        }

                    }
                    if (currmax > max){
                        max = currmax;
                        currmax = 0;
                    }
                    else{
                        currmax = 0;
                    }
                }
            }
        }

        return max;



    }
}
