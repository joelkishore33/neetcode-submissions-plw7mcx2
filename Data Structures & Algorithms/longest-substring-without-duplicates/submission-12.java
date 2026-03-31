class Solution {
    public int lengthOfLongestSubstring(String s) {
    //     if (s.length() == 0){
    //         return 0;
    //     }
    //     if (s.length() == 1){
    //         return 1;
    //     }
    //     int left = 0;
    //     int right = left+1;
    //     ArrayList<Integer> mike = new ArrayList<Integer>();

    //     while (right < s.length()){
    //         ArrayList<Character> joel = new ArrayList<Character>();
    //         joel.add(s.charAt(left));
    //         if ((s.charAt(left) != s.charAt(right)) && !(joel.contains(s.charAt(right)))){
    //             right++;
    //             joel.add(s.charAt(right));
    //         }
    //         else{
    //             mike.add(joel.size());
    //             left = right;
    //             right = left + 1;
    //         }
    //     }
    //     int max = 0;
    //     for (int i = 0; i < mike.size(); i++){
    //         if (max < mike.get(i)){
    //             max = mike.get(i);
    //         }
    //     }
    
    // return max;
    int max = 1;
    if (s.length() == 0){
        return 0;
    }
    if (s.length() == 1){
        return 1;
    }
    ArrayList<Character> joel = new ArrayList<>();
    int left = 0;
    int right = left + 1;
    joel.add(s.charAt(left));

    int currmax = 1;
    while (right < s.length()){
        if (!joel.contains(s.charAt(right))){
            joel.add(s.charAt(right));
            currmax++;
            right++;
            if (currmax > max){
                max = currmax;
            }
        }
        else{
            if (joel.get(left) == s.charAt(right)){
                joel.remove(left);
                joel.add(s.charAt(right));            
                right++;               
            }
            else{
                ArrayList<Character> jason = new ArrayList<>();
                jason.add(s.charAt(right));
                joel = jason;
                currmax = 1;
                right++;
            }
        }
    }
    return max;
    }
}
