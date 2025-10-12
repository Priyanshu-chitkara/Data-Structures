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
    public boolean func(TreeNode root,int targetSum){
        if(root==null){
            return false;
        }
        targetSum-=root.val;
        if(root.left==null && root.right==null){
            return targetSum==0;
        }
        // int left=func(root.left,targetSum);
        // int right=func(root.right,targetSum);
        return func(root.left,targetSum) || func(root.right,targetSum);
        
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
       return func(root,targetSum);
      
        
    }
}