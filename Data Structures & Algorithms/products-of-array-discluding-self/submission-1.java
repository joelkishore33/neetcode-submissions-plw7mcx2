class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] joel = new int[nums.length];
        int pt = 0;
        int[] jason = new int[nums.length];
        int[] result = new int[nums.length];

        int sum = 1;
        for (int i = 0; i < nums.length; i++) {
            sum *= nums[i];
            joel[i] = sum;
        }

        int sum1 = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            sum1 *= nums[i];
            jason[i] = sum1;
        }

       for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[i] = jason[i + 1];
            } 
            else if (i == nums.length - 1) {
                result[i] = joel[i - 1];
            } 
            else {
                result[i] = joel[i - 1] * jason[i + 1];
            }
        }

        return result;
        
    }
}  
