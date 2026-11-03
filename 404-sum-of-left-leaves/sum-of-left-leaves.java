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
    int left(TreeNode root,boolean is_left){
        if(root==null) return 0;
        if(root.left==null&& root.right==null){
            if(is_left) return root.val;
            else return 0;
        }
        return left(root.left,true)+left(root.right,false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return left(root,false);
    }
}