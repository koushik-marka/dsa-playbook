/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans=null;
    void fun(TreeNode c,TreeNode t){
        if(c==null) return;
        if(c.val==t.val) ans=c;
        fun(c.left,t);
        fun(c.right,t);
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        fun(cloned,target);
        return ans;
    }
}