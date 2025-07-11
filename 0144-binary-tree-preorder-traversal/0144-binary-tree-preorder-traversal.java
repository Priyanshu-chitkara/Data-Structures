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
    public void preorder(TreeNode root,List<Integer> st){
        if(root==null){
            return;
        }
        st.add(root.val);
        preorder(root.left,st);
        preorder(root.right,st);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> st=new ArrayList<>();
        preorder(root,st);
        return st;
        
    }
}