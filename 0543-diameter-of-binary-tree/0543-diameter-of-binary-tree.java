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
    int maxi=0;
    public int func(TreeNode p){
        if(p==null){
            return 0;
        }
        int ls=func(p.left);
        int rs=func(p.right);
        maxi=Math.max(maxi,ls+rs);

        return Math.max(ls,rs)+1;

    }
     

    
    public int diameterOfBinaryTree(TreeNode root) {
       func(root);
      
       return maxi;
    }
}