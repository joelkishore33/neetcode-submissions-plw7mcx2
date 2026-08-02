/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    PriorityQueue<Integer> joel = new PriorityQueue<>();

    public int kthSmallest(TreeNode root, int k) {
        kthSmallest1(root, k);
        for (int i = 1; i < k; i++){
            joel.poll();
        }

        return joel.peek();
    }

    public boolean kthSmallest1(TreeNode root, int k){
        if (root != null){
            joel.add(root.val);
            kthSmallest1(root.left, k);
            kthSmallest1(root.right, k);
        }
        return true;
    }

}
