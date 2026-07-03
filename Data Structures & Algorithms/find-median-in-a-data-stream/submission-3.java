class MedianFinder {

    public ArrayList<Integer> joel;

    public MedianFinder() {
        this.joel = new ArrayList<>();
    }
    
    public void addNum(int num) {
        if (joel.size() == 0){
            joel.add(num);
        }
        else if (joel.size() == 1 && joel.get(0) >= num){
            joel.add(0, num);
        }
        else if(joel.size() == 1){
            joel.add(1, num);
        }
        else{
            int left = 0;
            int right = joel.size();
            while(left < right){
                int mid = left + (right - left) / 2;

                if (num > joel.get(mid)) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            joel.add(left, num);           
        }
    }
    
    public double findMedian() {
        if (joel.size() == 1){
            return (double) joel.get(0);
        }
        else if (joel.size() % 2 == 1){
            int right = joel.size();
            int mid = (joel.size() / 2);
            return (double) joel.get(mid);
        }
        else{
            int mid1 = joel.size() / 2 - 1;
            double midl = joel.get(mid1);
            if (joel.size() == 2){
                int mid2 = 1;
                double midh = joel.get(mid2);
                return (midl + midh) / 2;
            }
            int mid2 = (joel.size() / 2);
            double midh = joel.get(mid2);

            return (midl + midh) / 2;

        }
    }
}
