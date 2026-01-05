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
    public void inorder(TreeNode root,int k,List<Integer> ls){
        if(root==null){
            return;
        }
        inorder(root.left,k,ls);
        ls.add(root.val);
        inorder(root.right,k,ls);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ls=new ArrayList<>();
        inorder(root,k,ls);
       return ls.get(k-1);
        
    }
}