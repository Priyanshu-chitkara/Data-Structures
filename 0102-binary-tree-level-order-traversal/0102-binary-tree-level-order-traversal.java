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
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int n=que.size();
            List<Integer> ls=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode rem=que.poll();
                int x=rem.val;
                ls.add(x);
                if(rem.left!=null){
                    que.add(rem.left);
                }
                if(rem.right!=null){
                    que.add(rem.right);
                }

            }
            res.add(ls);
        }
        return res;
        
    }
}