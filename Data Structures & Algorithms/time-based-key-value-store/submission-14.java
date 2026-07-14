class TimeMap {

    public HashMap<String, List<String>> joel;
    public HashMap<String, List<Integer>> atharva;

    public TimeMap() {
        this.joel = new HashMap<>();
        this.atharva = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!(joel.containsKey(key))){
            joel.put(key, new ArrayList<>());
            joel.get(key).add(value);
            atharva.put(key, new ArrayList<>());
            atharva.get(key).add(timestamp);
        }
        else{
            joel.get(key).add(value);
            atharva.get(key).add(timestamp);
        }
    }
    
    public String get(String key, int timestamp) {
        String result = "";

        if (!(joel.containsKey(key))){
            return result;
        }

        List<String> jason = joel.get(key);
        List<Integer> mike = atharva.get(key);
        int index = 0;
        int maxstamp = Integer.MAX_VALUE;

        for (int i = 0; i < mike.size(); i++){
            int count = i;
            if (mike.get(i) == timestamp){
                index = i;
                return jason.get(index);
            }
            else if (mike.get(i) <= maxstamp){
                maxstamp = mike.get(i);
                if ((count += 1) == mike.size() && maxstamp > timestamp){
                    return "";
                }
            }
            else if ((count += 1) == mike.size() && maxstamp > timestamp){
                return "";
            }
        }

        for(int i = 0; i < jason.size(); i++){
            if (i != 0 && mike.get(i) > timestamp){
                return jason.get(i - 1);
            }
            else if (i == 0 && mike.get(i) > timestamp){
                return jason.get(0);
            }
        }
        
        return jason.get(jason.size() - 1);

    }   
}
