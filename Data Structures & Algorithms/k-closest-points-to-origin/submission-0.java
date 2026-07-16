class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> joel = new PriorityQueue<>(
            (a, b) -> Integer.compare(
            a[0] * a[0] + a[1] * a[1],
            b[0] * b[0] + b[1] * b[1]
        )
        );
        int[][] jason = new int[k][2];
        int rowCount = points.length;

        for (int i = 0; i < rowCount; i++){
            double val = Math.sqrt((points[i][0] * points[i][0] + points[i][1] * points[i][1]));
            joel.add(points[i]);
        }

        for (int i = 0; i < k; i++){
            int[] x = joel.poll();
            jason[i][0] = x[0];
            jason[i][1] = x[1];
        }

        return jason;

    }
}
