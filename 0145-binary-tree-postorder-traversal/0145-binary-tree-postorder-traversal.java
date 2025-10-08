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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> st=new Stack<TreeNode>();
        Stack<TreeNode> st1=new Stack<TreeNode>();
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        st.push(root);
        while(!st.isEmpty()){
            root=st.pop();
            st1.add(root);
            if(root.left!=null){
                st.push(root.left);
            }
            if(root.right!=null){
                st.push(root.right);
            }
        }
        while(!st1.isEmpty()){
            list.add(st1.pop().val);
        }
        return list;

        
    }
}