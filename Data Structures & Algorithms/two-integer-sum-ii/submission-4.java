class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = left + 1;

        while (left != right){
            if (right == numbers.length){
                left+=1;
                right = left+1;
            }
            else if (numbers[left] + numbers[right] == target){
                return new int[]{left+1, right+1};
            }
            else{
                right++;
            }
        }
        return new int[]{left+1, right+1};
    }
}
