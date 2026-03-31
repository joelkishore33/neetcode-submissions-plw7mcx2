class Solution {
    public int search(int[] nums, int target) {
        int mid = nums.length / 2;
        if (nums[mid] == target){
            return mid;
        }
        if (nums[mid] > target){
            for (int i = 0; i < mid; i++){
                if (nums[i] == target){
                    return i;
                }
            }
        }
        else{
            for (int i = mid; i < nums.length; i++){
                if (nums[i] == target){
                    return i;
                }
            }
        }

        return -1;






    }
}
