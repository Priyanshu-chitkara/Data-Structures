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
        List<List<Integer>> res=new ArrayList<>();
        int level=0;
        if(root==null){
            return res;

        }
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            List<Integer> ls=new ArrayList<>();
            int n=que.size();
            for(int i=0;i<n;i++){
                TreeNode x=que.poll();
                ls.add(x.val);
                if(x.left!=null){
                    que.add(x.left);
                }
                if(x.right!=null){
                    que.add(x.right);
                }
               
                

            }
            
            if(level%2==0){
                res.add(ls);

            }
            else{
                Collections.reverse(ls);
                res.add(ls);
            }
            level++;
            
            
            
        }
        return res;
      
        
    }
}