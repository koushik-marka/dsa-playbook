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
    List<String> ans=new ArrayList<>();
    
    void fun(TreeNode root,String l){
        if(root== null) return;
        l+="->"+String.valueOf(root.val);
        if(root.left==null && root.right==null){
            ans.add(l.substring(2,l.length()));
        }
        
        fun(root.left,l);
        fun(root.right,l);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        fun(root,"");
        return ans;
    }
}