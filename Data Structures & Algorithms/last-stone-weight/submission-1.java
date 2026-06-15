class Solution {
    public int lastStoneWeight(int[] stones) {

        ArrayList<Integer> jason = new ArrayList<>();
        for (int i = 0; i < stones.length; i++){
            jason.add(stones[i]);
        }
        while (jason.size() > 1){
            int[] joel = findLargestWeights(jason);
            int xind = Integer.MIN_VALUE;
            int yind = Integer.MIN_VALUE;

            for (int i = 0; i < jason.size(); i++){
                if (jason.get(i) == joel[0] && xind == Integer.MIN_VALUE){
                    xind = i;
                }
                else if (jason.get(i) == joel[1]){
                    yind = i;
                }
            }

            if (joel[0] > joel[1]){
                int x = jason.get(xind) - jason.get(yind);
                jason.set(xind, x);
                jason.remove(yind);
            }
            else if (joel[0] < joel[1]){
                int y = jason.get(yind) - jason.get(xind);
                jason.set(yind, y);
                jason.remove(xind);
            }
            else{
                jason.remove(yind);
                jason.remove(xind);
            }
        }
        if (jason.size() == 1){
            return jason.get(0);
        }
        else{
            return 0;
        }
    }
    public int[] findLargestWeights(ArrayList<Integer> stones){
        
        int x = Integer.MIN_VALUE;
        int y = Integer.MIN_VALUE;

        for (int i = 0; i < stones.size(); i++){
            if (stones.get(i) > x && stones.get(i) > y){
                y = x;
                x = stones.get(i);
            }
            else if(stones.get(i) > y){
                y = stones.get(i);
            }
        }

        return new int[]{x, y};
    }
}
