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
    public boolean isEvenOddTree(TreeNode root) {
        int l=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            int pe=Integer.MAX_VALUE;
            int po=0;
            for(int i=0;i<n;i++){
                TreeNode cur=q.poll();
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
                if(l%2==0){
                    if(po>=cur.val || cur.val%2==0){
                        return false;
                    }
                
                        po=cur.val;
                    
                }
                else{
                    if(pe<=cur.val || cur.val%2!=0){
                        return false;
                    }
                    pe=cur.val;
                }
            }
            l++;
        }
        return true;
    }
}