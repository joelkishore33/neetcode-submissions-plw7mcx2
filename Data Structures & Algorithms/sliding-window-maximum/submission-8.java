class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int max1 = 0;
        int max1pt = 0;
        int max2 = 0;
        int max2pt = 0;
        ArrayList<Integer> joel = new ArrayList<>();

        for (int i = 0; i < k; i++){
            int currmax = nums[i];
            if (currmax >= max1 && currmax > max2){
                max2 = max1;
                max2pt = max1pt;
                max1 = currmax;
                max1pt = i;
            }
            else if (currmax >= max2){
                max2 = currmax;
                max2pt = i;
            }
        }

        joel.add(max1);
        if (nums.length == 2 && k == 1){
            return new int[]{max1, nums[1]};
        }
        int left = 1;
        int right = k;

        while (right < nums.length){
            if (nums[left - 1] == max1 && (left - 1) == max1pt){
                max1 = Integer.MIN_VALUE;
                max1pt = Integer.MIN_VALUE;
                max2 = Integer.MIN_VALUE;
                max2pt = Integer.MIN_VALUE;

                for (int i = left; i <= right; i++){
                    int curr = nums[i];
                    if (curr >= max1 && curr > max2){
                        max2 = max1;
                        max2pt = max1pt;
                        max1 = curr;
                        max1pt = i;
                    }
                    else if (curr >= max2){
                        max2 = curr;
                        max2pt = i;
                    }
                }
                joel.add(max1);
                left++;
                right++;
            }
            else if (nums[left - 1] == max2 && (left - 1) == max2pt){
                max2 = Integer.MIN_VALUE;
                max2pt = Integer.MIN_VALUE;

                for (int i = left; i <= right; i++){
                    int curr = nums[i];
                    if (curr >= max1 && curr > max2){
                        max2 = max1;
                        max2pt = max1pt;
                        max1 = curr;
                        max1pt = i;
                    }
                    else if (curr >= max2){
                        max2 = curr;
                        max2pt = i;
                    }
                }
                joel.add(max1);
                left++;
                right++;
            }
            else{
                if (nums[right] >= max1){
                    max2 = max1;
                    max2pt = max1pt;
                    max1 = nums[right];
                    max1pt = right;
                }
                else if (nums[right] > max2){
                    max2 = nums[right];
                    max2pt = right;
                }
                joel.add(max1);
                left++;
                right++;
            }
        }
        
        int[] jason = new int[joel.size()];

        for(int i = 0; i < joel.size(); i++){
            jason[i] = joel.get(i);
        }

        return jason;

    }
}
