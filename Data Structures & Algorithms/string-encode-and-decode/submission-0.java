class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < strs.size(); i++){
            int count = 0;
            while(count != strs.get(i).length()){
                char temp = (char)(strs.get(i).charAt(count) + 1);
                String sb = String.valueOf(temp);
                str.append(sb);
                count++;
            }
            str.append(" ");
        }
        String result = str.toString();
        return result;

    }

    public List<String> decode(String str) {
        List<String> joel = new ArrayList<>();
        StringBuilder stri = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            while(str.charAt(i) != ' '){
                char temp = (char)(str.charAt(i) - 1);
                String sb = String.valueOf(temp);
                stri.append(sb);
                i++;
            }
            String result = stri.toString();
            joel.add(result);
            stri.setLength(0);
        }

        return joel;
    }
}
