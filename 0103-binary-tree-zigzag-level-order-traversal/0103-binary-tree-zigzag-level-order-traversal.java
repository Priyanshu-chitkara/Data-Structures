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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       
        List<List<Integer>> rs=new ArrayList<>();
         if(root==null){
            return rs;
        }
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        int level=0;
        while(!que.isEmpty()){
            int n=que.size();
            List<Integer> ls=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node=que.poll();
                ls.add(node.val);
                
                if(node.left!=null){
                    que.add(node.left);
                }
                if(node.right!=null){
                    que.add(node.right);
                }


            }
            if(level%2!=0){
                Collections.reverse(ls);
            }
            level++;
            rs.add(ls);
        }
        return rs;

        
    }
}