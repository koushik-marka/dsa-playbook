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
    boolean istrue(TreeNode root, int n,int p){
        if(root==null) return false;
        p+=root.val;
        if(root.left==null && root.right==null ){
            if(p==n) return true;
        }
        return istrue(root.left,n,p) || istrue(root.right,n,p);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return istrue(root,targetSum,0);
        
    }
}