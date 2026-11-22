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
    TreeNode prev;
    TreeNode f;
    TreeNode s;
    void fun(TreeNode root){
        if(root==null) return;
        fun(root.left);
        if(prev!=null && prev.val>root.val){
            if(f==null){
                f=prev;
            }
            s=root;
        }
        prev=root;
        fun(root.right);
    }
    public void recoverTree(TreeNode root) {
        fun(root);
        int t=f.val;
        f.val=s.val;
        s.val=t;
        
    }
}