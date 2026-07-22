class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        int turned = 0;
        int minutes = 0;
        int ct = 0;
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> joel = new LinkedList<>();
        int[] mike = new int[]{-1, -1};

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (grid[i][j] == 1){
                    fresh++;
                }
                if(grid[i][j] == 2){
                    joel.add(new int[]{i, j});
                }
            }
        }
        joel.add(mike);
        while(joel.size() != 0){
            int[] jason = joel.poll();
            if (jason == mike){
                if (joel.size() == 0){
                    break;
                }
                else{
                    minutes++;
                    joel.add(mike);
                }
            }
            else{
                if (jason[0] - 1 >= 0 && grid[jason[0] - 1][jason[1]] == 1){
                    grid[jason[0] - 1][jason[1]] = 2;
                    turned++;
                    joel.add(new int[]{jason[0] - 1, jason[1]});
                }
                if (jason[1] - 1 >= 0 && grid[jason[0]][jason[1] - 1] == 1){
                    grid[jason[0]][jason[1] - 1] = 2;
                    turned++;
                    joel.add(new int[]{jason[0], jason[1] - 1});
                }
                if (jason[0] + 1 != row && grid[jason[0] + 1][jason[1]] == 1){
                    grid[jason[0] + 1][jason[1]] = 2;
                    turned++;
                    joel.add(new int[]{jason[0] + 1, jason[1]});
                }
                if (jason[1] + 1 != col && grid[jason[0]][jason[1] + 1] == 1){
                    grid[jason[0]][jason[1] + 1] = 2;
                    turned++;
                    joel.add(new int[]{jason[0], jason[1] + 1});
                }
            }
            }


        if (turned == fresh){
            return minutes ;
        }
        else{
            return -1;
        }



    }
}
