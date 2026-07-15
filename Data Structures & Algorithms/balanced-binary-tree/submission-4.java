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
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        int left = findHeight(root.left);
        int right = findHeight(root.right);

        boolean boolleft = isBalanced(root.left);
        boolean boolright = isBalanced(root.right);


        if (Math.abs(right - left) > 1){
            return false;
        }
        if (boolleft == true && boolright == true){
            return true;
        }
        return false;

    }

    public int findHeight(TreeNode root){
        if (root == null){
            return 0;
        }
        return 1 + Math.max(findHeight(root.right), findHeight(root.left));
    }
}
