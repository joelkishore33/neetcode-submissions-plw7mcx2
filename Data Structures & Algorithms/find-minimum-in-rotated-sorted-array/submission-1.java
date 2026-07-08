class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int min = Integer.MAX_VALUE;


        while (left <= right){
            int mid = left + (right - left) / 2;
            int currmin = nums[mid];
            if (currmin < min){
                min = currmin;
            }
            if (nums[left] < nums[right]){
                if (nums[right] > nums[mid] && nums[mid] < nums[left]){
                    left = mid + 1;
                    mid = left + (right - left) / 2;
                }
                else{
                    right = mid - 1;
                    mid = left + (right - left) / 2;
                }
            }
            else{
                if (nums[left] > nums[mid] && nums[mid] < nums[right]){
                    right = mid - 1;
                    mid = left + (right - left) / 2;
                }
                else{
                    left = mid + 1;
                    mid = left + (right - left) / 2;
                }
            }
        }
        return min;
    }
}
