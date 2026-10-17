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
    boolean ch(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.left==null && q.right!=null || p.right==null && q.left!=null){
            return false;
        }
        return p.val==q.val && ch(p.left,q.right) && ch(p.right,q.left);
        
    }
    public boolean isSymmetric(TreeNode root) {
        return ch(root.left,root.right);
    }
}