class Solution {
    public int findDuplicate(int[] nums) {
        int left = 0;
        int right = left + 1;

        while (right < nums.length){
            if (nums[left] == nums[right]){
                return nums[left];
            }
            if (right + 1 == nums.length){
                left += 1;
                right = left + 1;
            }
            else{
                right++;
            }
        }
        return nums[right - 1];
    }
}
