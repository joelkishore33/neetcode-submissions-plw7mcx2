class Solution {
    public boolean canJump(int[] nums) {
        int right = nums.length - 1;
        
        for (int i = nums.length - 1; i >= 0; i--){
            if (i + nums[i] >= right){
                right = i;
            }
        }
        if (right == 0){
            return true;
        }
        else{
            return false;
        }
        
    }
}
