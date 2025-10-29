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
   public boolean isansr(TreeNode q1,TreeNode q2){
    if(q1==null && q2==null){
        return true;
    }
    if(q1==null || q2==null){
        return false;
    }
    if(q1.val!=q2.val){
        return false;
    }


   
    return isansr(q1.left,q2.right) && isansr(q1.right,q2.left);
   }
  
    public boolean isSymmetric(TreeNode root) {
        return isansr(root.left,root.right);
        
    }
}