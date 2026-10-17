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
    void pre(List al,TreeNode root){
        if(root==null) return;
        al.add(root.val) ;
        pre(al,root.left);
        pre(al,root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> al=new ArrayList<>();
        pre(al,root);
        return al;
    }
}