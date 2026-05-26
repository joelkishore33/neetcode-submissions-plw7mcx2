class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int left = 0;
        int mid = left + 1;
        int right = mid + 1;
        List<List<Integer>> matrix = new ArrayList<>();
        
        while (right != nums.length){
            if (nums[left] + nums[mid] + nums[right] == 0 && right == nums.length - 1 && mid != nums.length - 2){
                List<Integer> joel = new ArrayList<>(List.of(nums[left], nums[mid], nums[right]));
                Collections.sort(joel);
                if (!matrix.contains(joel)){
                    matrix.add(joel);
                }
                mid++;
                right = mid + 1;
            }
            else if (nums[left] + nums[mid] + nums[right] == 0 && right == nums.length - 1 && mid == nums.length - 2){
                List<Integer> joel = new ArrayList<>(List.of(nums[left], nums[mid], nums[right]));
                Collections.sort(joel);
                if (!matrix.contains(joel)){
                    matrix.add(joel);
                }
                left++;
                mid = left + 1;
                right = mid + 1;
            }
            else if (nums[left] + nums[mid] + nums[right] != 0 && right == nums.length - 1 && mid != nums.length - 2){
                mid++;
                right = mid + 1;
            }
            else if (nums[left] + nums[mid] + nums[right] != 0 && right == nums.length - 1 && mid == nums.length - 2){
                left++;
                mid = left + 1;
                right = mid + 1;
            }
            else if (nums[left] + nums[mid] + nums[right] == 0){
                List<Integer> joel = new ArrayList<>(List.of(nums[left], nums[mid], nums[right]));
                Collections.sort(joel);
                if (!matrix.contains(joel)){
                    matrix.add(joel);
                }
                right++;
            }
            else{
                right++;
            }
        }
        return matrix;
    }
}
