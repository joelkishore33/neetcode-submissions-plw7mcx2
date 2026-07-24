class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        Stack<int[]> joel = new Stack<>();
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (grid[i][j] == '1'){
                    joel.push(new int[]{i, j});
                    grid[i][j] = '2';
                    islands++;
                }
                while(joel.size() != 0){
                    int[] jason = joel.pop();
                    if (jason[0] - 1 >= 0 && grid[jason[0] - 1][jason[1]] == '1'){
                        joel.push(new int[]{jason[0] - 1, jason[1]});
                        grid[jason[0] - 1][jason[1]] = '2';
                    }
                    if (jason[0] + 1 != row && grid[jason[0] + 1][jason[1]] == '1'){
                        joel.push(new int[]{jason[0] + 1, jason[1]});
                        grid[jason[0] + 1][jason[1]] = '2';
                    }
                    if (jason[1] - 1 >= 0 && grid[jason[0]][jason[1] - 1] == '1'){
                        joel.push(new int[]{jason[0], jason[1] - 1});
                        grid[jason[0]][jason[1] - 1] = '2';
                    }
                    if (jason[1] + 1 != col && grid[jason[0]][jason[1] + 1] == '1'){
                        joel.push(new int[]{jason[0], jason[1] + 1});
                        grid[jason[0]][jason[1] + 1] = '2';
                    }
                }
            }
        }
        return islands;
    }
}
