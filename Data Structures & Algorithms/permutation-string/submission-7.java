class Solution {
    public boolean checkInclusion(String s1, String s2) {
        ArrayList<Character> joel = new ArrayList<>();
        ArrayList<Character> backupList = new ArrayList<>();
        ArrayList<Character> jason = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++){
            joel.add(s1.charAt(i));
            backupList.add(s1.charAt(i));
        }

        for (int i = 0; i < s2.length(); i++){
            jason.add(s2.charAt(i));
        }

        for (int i = 0; i < jason.size(); i++){
            
            if (joel.contains(jason.get(i))){
                joel.remove(jason.get(i));
                if (joel.size() == 0) {
                    return true;
                }
            }
            else if (!(joel.contains(jason.get(i))) && joel.size() < backupList.size()){
                int x = backupList.size() - joel.size();
                joel = new ArrayList<>(backupList);
                i = i - x;
            }
        }

        return false;

    }
}
