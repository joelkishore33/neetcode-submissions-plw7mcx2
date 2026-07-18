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

    int diam = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null){
            return 0;
        }

        int x = 0;
        int y = 0;
        int currdiam = 0;

        x = maxDepth(root.left);
        y = maxDepth(root.right);
        currdiam = x + y;
        if (currdiam > diam){
            diam = currdiam;
        }

        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);

        return diam;
        
    }
    public int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        return 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
    }
}
