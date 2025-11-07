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
    public int ans(TreeNode root,int res){
      res=root.left.val+root.right.val;
     return res;

       
    }
    public boolean checkTree(TreeNode root) {
        int res=root.val;
       int val= ans(root,res);
       if(res!=val){
        return false;
       }
       return true;
        
    }
}