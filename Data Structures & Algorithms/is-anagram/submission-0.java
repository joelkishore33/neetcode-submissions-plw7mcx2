class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> joel = new ArrayList<Character>();
        if (s.length() != t.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i++){
            joel.add(s.charAt(i));
        }
        for (int j = 0; j < t.length(); j++){

            Character jason = t.charAt(j);
            if (joel.contains(jason)) {
                joel.remove(jason);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
