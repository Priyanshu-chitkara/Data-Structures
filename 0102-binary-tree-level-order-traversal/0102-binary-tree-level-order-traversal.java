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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> st=new LinkedList<>();
        st.offer(root);
        while(!st.isEmpty()){
            int size=st.size();
            ArrayList<Integer> list=new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode node=st.poll();
                list.add(node.val);
                if(node.left!=null){
                    st.add(node.left);
                }
                if(node.right!=null){
                    st.add(node.right);
                }

            }
            result.add(list);
        }
        return result;
        
    }
}