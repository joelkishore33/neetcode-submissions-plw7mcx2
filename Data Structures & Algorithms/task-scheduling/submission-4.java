
class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> joel = new HashMap<>();
        ArrayList<Character> jason = new ArrayList<>();

        for (int i = 0; i < tasks.length; i++) {
            char key = tasks[i];

            if (joel.containsKey(key)) {
                joel.put(key, joel.get(key) + 1);
            } else {
                joel.put(key, 1);
                jason.add(key);
            }
        }

        int cycle = 0;
        ArrayList<Character> subarray = new ArrayList<>();

        while (joel.size() != 0) {
            int start = Math.max(0, subarray.size() - n);
            List<Character> cooldown = subarray.subList(start, subarray.size());

            Character bestTask = null;
            int bestCount = -1;
            int bestLastUsed = Integer.MAX_VALUE;

            for (int i = 0; i < jason.size(); i++) {
                char curr = jason.get(i);

                if (!joel.containsKey(curr)) {
                    continue;
                }

                int count = joel.get(curr);

                if (count > 0 && !cooldown.contains(curr)) {
                    int lastUsed = lastIndexOf(subarray, curr);

                    if (count > bestCount || 
                       (count == bestCount && lastUsed < bestLastUsed)) {
                        bestTask = curr;
                        bestCount = count;
                        bestLastUsed = lastUsed;
                    }
                }
            }

            if (bestTask == null) {
                subarray.add('_');
                cycle++;
            } else {
                subarray.add(bestTask);
                cycle++;

                int remaining = joel.get(bestTask) - 1;

                if (remaining == 0) {
                    joel.remove(bestTask);
                    jason.remove(bestTask);
                } else {
                    joel.put(bestTask, remaining);
                }
            }
        }

        return cycle;
    }

    private int lastIndexOf(ArrayList<Character> arr, char target) {
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) == target) {
                return i;
            }
        }
        return -1;
    }
}