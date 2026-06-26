class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> joel = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++){
            joel.add(nums[i]);
        }

        for (int i = 0; i < nums.length - k; i++){
            joel.poll();
        }

        return joel.peek();

    }
}
