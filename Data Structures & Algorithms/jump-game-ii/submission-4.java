class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int left = 0;
        if (nums.length == 1){
            return 0;
        }

        while (left < nums.length){
            if (nums[left] + left >= nums.length - 1){
                jumps++;
                return jumps;
            }
            int max = 0;
            int j = 0;
            for (int i = left + 1; i <= nums[left] + left; i++){
                if (nums[i] >= max){
                    max = nums[i];
                    j = i;
                }
                else if (nums[i] + i >= nums.length - 1 && jumps == 0){
                    jumps += 2;
                    return jumps;
                }
                else if (nums[i] + i >= nums.length - 1 && jumps == 1){
                    jumps += 1;
                    return jumps;
                }
            }
            left = j;
            jumps++;
        }

        return jumps;

    }
}
