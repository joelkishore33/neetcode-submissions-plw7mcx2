class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] joel = new int[temperatures.length];

        int left = 0;
        int right = 1;
        int curr = 1;

        while (right != temperatures.length){
            if (temperatures[right] > temperatures[left]){
                joel[left] = curr;
                curr = 1;
                left++;
                right = left + 1;
            }
            else if (temperatures[right] <= temperatures[left] && right != temperatures.length - 1){
                right++;
                curr++;
            }
            else{
                joel[left] = 0;
                left++;
                curr = 1;
                right = left + 1;
            }
        }

        return joel;
    }
}
