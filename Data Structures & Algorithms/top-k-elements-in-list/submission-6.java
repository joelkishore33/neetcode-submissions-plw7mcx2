class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> joel = new HashMap<>();
        PriorityQueue<Integer> jason = new PriorityQueue<>(Collections.reverseOrder());
        int[] atharva = new int[k];

        for (int i = 0; i < nums.length; i++){
            if (joel.get(nums[i]) == null){
                joel.put(nums[i], 1);
            }
            else{
                joel.put(nums[i], joel.get(nums[i]) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> e : joel.entrySet()){
            jason.add(e.getValue());
        }
        
        int ite = 0;
        while (ite < k){
            for (Map.Entry<Integer, Integer> e : joel.entrySet()){
                if (ite < k && jason.peek() == e.getValue()){
                    atharva[ite] = e.getKey();
                    ite += 1;
                    jason.remove(jason.peek());
                }
            }
        }
        return atharva;
    }
}
