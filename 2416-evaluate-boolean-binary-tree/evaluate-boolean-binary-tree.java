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
    boolean fun(TreeNode root){
        if(root.left==null && root.right==null) {
            if(root.val==0) return false;
            else return true;
        }
        boolean l=fun(root.left);
        boolean r=fun(root.right);
        if(root.val==2) return l||r;
        return l&&r;
    }
    public boolean evaluateTree(TreeNode root) {
        return fun(root);
    }
}