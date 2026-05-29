class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        Arrays.sort(piles);
        int right = piles[piles.length - 1];
        int result = right;

        while (left <= right){
            int k = (left + right) / 2;
            int hours = 0;
            for (int i = 0; i < piles.length; i++){
                hours+= Math.ceil(piles[i]/k);
                if (piles[i] % k >= 1){
                    hours+=1;
                }
            }
        
            if (hours <= h){
                result = Math.min(right, k);
                right = k - 1;
            }
            else{
                left = k + 1;
            }
        }
        return result;

    }
}
