class Solution {
    public int longestConsecutive(int[] nums) {
        TreeMap<Integer, Integer> joel = new TreeMap<>();
        int val = 0;

        for (int i = 0; i < nums.length; i++){
            if(!(joel.containsKey(nums[i]))){
                joel.put(nums[i], 1);
            }
        }

        Integer[] keys = joel.keySet().toArray(new Integer[0]);

        int max = 0;
        int curr = 1;

        for(int i = 0; i < keys.length; i++){
            if (i + 1 != keys.length && keys[i] + 1 == keys[i + 1]){
                curr++;
            }
        
            else{
                if (curr > max){
                    max = curr;
                }
                curr = 1;
            }
        }

        return max;
        
    }
}
