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
    int m=Integer.MAX_VALUE;
    int c=-1;
    void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(c!=-1){
            m=Math.min(m,Math.abs(c-root.val));
        }
        c=root.val;
        inorder(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return m;
    }
}