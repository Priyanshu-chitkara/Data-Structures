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
    int x=0;
    public int func(TreeNode root){
        
        if(root==null){
            return 0;
        }
        int left=func(root.left);
        
        if(root.left!=null && root.left.left==null && root.left.right==null ){
            x+=root.left.val;
        }
         
       
        int right=func(root.right);
        return x;


    }
    public int sumOfLeftLeaves(TreeNode root) {
        int ans=func(root);
        return ans;
        
        
    }
}