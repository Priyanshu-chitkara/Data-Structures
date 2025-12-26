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
    public int f(TreeNode root1){
        if(root1==null){
            return 0;
        }
      
        int leftt=f(root1.left);
        int rightt=f(root1.right);

        return 1 + Math.max(leftt,rightt);
    }
    public int maxDepth(TreeNode root) {
        int ans=f(root);
        return ans;
        
    }
}