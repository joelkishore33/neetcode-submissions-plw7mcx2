class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = 0;
        int col = 0;

        while (row != matrix.length){
            if (matrix[row][col] > target && row == 0){
                return false;
            }
            if (matrix[row][col] == target){
                return true;
            }
            if (matrix[row][col] > target){
                row -=1;
                break;
            }
            if (matrix[row][col] < target && row+1 != matrix.length){
                row++;
            }
            else{
                break;
            }
        }
        if (row == matrix.length){
            return false;
        }


        for (int i = 0; i < matrix[0].length; i++){
            if (matrix[row][i] == target){
                return true;
            }
        }

        return false;
        
    }
}
