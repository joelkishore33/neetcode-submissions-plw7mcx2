class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> jason = new ArrayList<>();

        if (s.length() % 2 == 1){
            return false;
        }

        for (int i = 0; i < s.length(); i++){
            jason.add(s.charAt(i));
        }

        int left = 0;
        int right = jason.size() - 1;
        while(left < right){
            if (jason.get(left) - jason.get(right) == -1 || jason.get(left) - jason.get(right) == -2){
                left++;
                right--;
            }
            else if (jason.get(left) - jason.get(left+1) == -1 || jason.get(left) - jason.get(left+1) == -2){
                left+=2;
            }
            else{
                return false;
            }
        }
        return true;



    }
}
