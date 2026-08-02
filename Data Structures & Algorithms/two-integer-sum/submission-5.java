class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> joel = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            joel.put(nums[i], i);
        }
        int left = 0;


        while (left < nums.length) {
            int otherIndex = joel.getOrDefault(target - nums[left], -1);

            if (otherIndex != -1 && otherIndex != left) {
                return new int[]{left, otherIndex};
            }

            left++;
        }

        return new int[]{-1, -1};


    }
}
