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
    int avgtree(TreeNode root){
        if(root==null){
            return 0;
        }
        int ans= sum(root);
        int c=count(root);
        return ans/c;

    }
    int sum(TreeNode root){
        if(root==null){
            return 0;
        }
        return root.val+sum(root.left)+sum(root.right);
    }
    int count(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+count(root.left)+count(root.right);
    }
    int c=0;
    int a(TreeNode root){
        if(root==null){
            return 0;
        }
        if( avgtree(root)==root.val){
            c++;
        }
        a(root.left);
        a(root.right);
        return c;
    }
    public int averageOfSubtree(TreeNode root) {
        return a(root);
    }
}