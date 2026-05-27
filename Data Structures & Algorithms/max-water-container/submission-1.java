class Solution {
    public int maxArea(int[] heights) {
        /*
        int left = 0;
        int right = left + 1;
        int max = 0;

        while(right < heights.length){
            int currmax = 0;
            if (heights[left] >= heights[right]){
                currmax = heights[right] * (right - left);
            }
            else if (heights[left] < heights[right]){
                currmax = heights[left] * (right - left);
            }
            if (currmax > max){
                max = currmax;
            }
            if (right != heights.length - 1){
                right++;
            }
            else{
                left++;
                right = left + 1;
            }
        }
        return max;
        */

        int left = 0;
        int right = heights.length - 1;
        int max = 0;

        while (left != right){
            int currmax = 0;

            if (heights[left] >= heights[right]){
                currmax = heights[right] * (right - left);
                if (currmax > max){
                    max = currmax;
                }
                right--;
            }
            else{
                currmax = heights[left] * (right - left);
                if (currmax > max){
                    max = currmax;
                }
                left++;
            }
        }
        return max;
    }
}
