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
    boolean fun(TreeNode root,long min,long max){
        if(root==null) return true;
        if(min>=root.val || max<=root.val) return false;
        return fun(root.left,min,root.val) && fun(root.right,root.val,max);
    }
    public boolean isValidBST(TreeNode root) {
        return fun(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}