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
    int ans=0;
    void fun(TreeNode root,String s){
        if(root==null) return ;
        s+=String.valueOf(root.val);
        if(root.left==null && root.right==null){
            if(s.isEmpty()) return;
            ans+=Integer.parseInt(s,2);
        }
        
        fun(root.left,s);
        fun(root.right,s);
    }
    public int sumRootToLeaf(TreeNode root) {
        fun(root,"");
        return ans;
    }
}