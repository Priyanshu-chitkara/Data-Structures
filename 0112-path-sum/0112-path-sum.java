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
    int total=0;
    public boolean ans(TreeNode root,int targetSum){
        if(root==null){
            return false;
        }
        targetSum-=root.val;
        if(root.right==null && root.left==null){
            return targetSum==0;
        }
        return ans(root.right,targetSum) || ans(root.left,targetSum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
       return  ans(root,targetSum);
        
        
    }
}