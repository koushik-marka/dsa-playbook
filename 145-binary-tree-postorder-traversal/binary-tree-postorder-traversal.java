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
    void post(List al,TreeNode root){
        if(root==null) return;
        post(al,root.left);
        post(al,root.right);
        al.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> al=new ArrayList<>();
        post(al,root);
        return al;
    }
}