class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int left = 0;
        int right = left + 1;

        while (right < prices.length){
            if (prices[left] > prices[right]){
                left = right;
                right++;
            }
            else{
                int curmax = prices[right] - prices[left];
                if (curmax > max){
                    max = curmax;
                }
                right++;
            }
        }
        return max;
    }
}
