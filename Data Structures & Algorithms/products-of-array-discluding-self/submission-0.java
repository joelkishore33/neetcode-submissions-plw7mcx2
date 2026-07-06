class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] joel = new int[nums.length];
        int pt = 0;
        int[] jason = new int[nums.length];
        int[] result = new int[nums.length];
        int pt1 = nums.length - 1;

        int sum = 1;
        while (pt != nums.length){
            joel[pt] = sum;
            sum *= nums[pt];
            pt++;
        }

        int sum1 = 1;

        while (pt1 >= 0){
            jason[pt1] = sum1;
            sum1 *= nums[pt1];
            pt1--;
        }

        for (int i = 0; i < nums.length; i++){
                result[i] = jason[i] * joel[i];
        }

        return result;
        
    }
}  
