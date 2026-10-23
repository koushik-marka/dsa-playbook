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
    public int maxLevelSum(TreeNode root) {
        int l=1;
        int ml=0;
        int ms=Integer.MIN_VALUE;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=0;
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode cur=q.peek();
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
                s+=cur.val;
                q.remove();
            }
            if(s>ms){
                ms=s;
                ml=l;
            }
            l++;
        }
        return ml;
    }
}