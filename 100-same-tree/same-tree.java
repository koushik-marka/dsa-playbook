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
    void pre(ArrayList al,TreeNode p){
        if(p==null){
            al.add(null);
            return;
        }
        al.add(p.val);
        pre(al,p.left);
        pre(al,p.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        pre(al1,p);
        pre(al2,q);
        return al1.equals(al2);
    }
}