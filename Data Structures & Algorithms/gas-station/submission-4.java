class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int left = 0;
        int right = 0;

        while (right != gas.length){
            if (gas[right] >= cost[right]){
                tank += gas[right];
                tank -= cost[right];
                right++;
                int temp = right;
                while (left != temp && tank >= 0){
                    if (temp < gas.length){
                        tank += gas[temp];
                        tank -= cost[temp];
                        temp++;
                    }
                    if (temp == gas.length){
                        temp = 0;
                    }
                    if (temp == left && tank >= 0){
                        return left;
                    }

                }
                if (temp > left){
                    left = temp;
                    right = temp;
                    tank = 0;
                }
                else{
                    break;
                }
            }
            else{
                left++;
                right++;
            }

        }

        return -1;
        

    }
}
