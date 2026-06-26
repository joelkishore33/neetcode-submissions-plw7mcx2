class KthLargest {

    int k;
    PriorityQueue<Integer> joel = new PriorityQueue<>();

    public KthLargest(int k, int[] nums) {
        this.k = k;

        for (int i = 0; i < nums.length; i++) {
            joel.add(nums[i]);

            if (joel.size() > k) {
                joel.poll();
            }
        }
    }
    
    public int add(int val) {
        joel.add(val);

        if (joel.size() > k) {
            joel.poll();
        }

        return joel.peek();
    }
}
