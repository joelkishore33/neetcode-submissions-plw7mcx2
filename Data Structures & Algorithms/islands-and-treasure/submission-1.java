class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int max = Integer.MAX_VALUE;
        Queue<int[]> jason = new LinkedList<>();

        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == 0){
                    jason.add(new int[]{i, j});
                }
            }
        }
        int val = 1;
        while(jason.size() != 0){
            int[] sandy = jason.poll();
                if (sandy[0] - 1 >= 0 && (grid[sandy[0] - 1][sandy[1]] == max)){
                    grid[sandy[0] - 1][sandy[1]] = grid[sandy[0]][sandy[1]] + 1;
                    jason.add(new int[]{sandy[0] - 1, sandy[1]});
                }
                if (sandy[0] + 1 < grid.length && grid[sandy[0] + 1][sandy[1]] == max){
                    grid[sandy[0] + 1][sandy[1]] = grid[sandy[0]][sandy[1]] + 1;
                    jason.add(new int[]{sandy[0] + 1, sandy[1]});
                }
                if (sandy[1] - 1 >= 0 && grid[sandy[0]][sandy[1] - 1] == max){
                    grid[sandy[0]][sandy[1] - 1] = grid[sandy[0]][sandy[1]] + 1;
                    jason.add(new int[]{sandy[0], sandy[1] - 1});
                }
                if (sandy[1] + 1 < grid[0].length && grid[sandy[0]][sandy[1] + 1] == max){
                    grid[sandy[0]][sandy[1] + 1] = grid[sandy[0]][sandy[1]] + 1;
                    jason.add(new int[]{sandy[0], sandy[1] + 1});
                }
            }
        }
    }
