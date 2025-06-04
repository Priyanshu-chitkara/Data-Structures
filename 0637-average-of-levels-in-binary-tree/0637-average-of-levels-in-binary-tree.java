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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList<>();
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
                    st.offer(node.left);
                }
                if(node.right!=null){
                    st.offer(node.right);
                }
            }
            Double sum=0.0;

            for(int i=0;i<list.size();i++){
                sum+=list.get(i);

            }
            Double avg=sum/list.size();
            result.add(avg);
            

        }
        return result;
        

    }
}