class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> joel = new HashMap<>();

        for (int i = 0; i < strs.length; i++){
            ArrayList<Character> jason = new ArrayList<>();
            for (int j = 0; j < strs[i].length(); j++){
                jason.add(strs[i].charAt(j));
            }
            Collections.sort(jason);
            StringBuilder key = new StringBuilder();
            for (int k = 0; k < jason.size(); k++){
                key.append(jason.get(k));
            }
            String keyString = key.toString();
            if (joel.containsKey(keyString)){
                joel.get(keyString).add(strs[i]);
            }
            else{
                ArrayList<String> mike = new ArrayList<>();
                mike.add(strs[i]);
                joel.put(keyString, mike);
            }
        }
        return new ArrayList<>(joel.values());
    }
}
