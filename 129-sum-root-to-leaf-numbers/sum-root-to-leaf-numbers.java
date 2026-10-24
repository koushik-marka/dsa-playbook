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
    int sum=0;
    void f(TreeNode root,int n){
        if(root==null) return;
        n=n*10+root.val;
        if(root.left==null && root.right==null){
            sum+=n;
        }
        f(root.left,n);
        f(root.right,n);
    }
    public int sumNumbers(TreeNode root) {
        f(root,0);
        return sum;
    }
}