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
    public int maxLevelSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        int x=Integer.MIN_VALUE;
        Queue<TreeNode> que=new LinkedList<>();
        List<Integer> ls=new ArrayList<>();
        que.offer(root);
        int sum=0;
       
        while(!que.isEmpty()){
           
            int n=que.size();
            for(int i=0;i<n;i++){
                TreeNode node=que.poll();
                sum+=node.val;
                
                if(node.left!=null){
                    que.add(node.left);
                }
                if(node.right!=null){
                    que.add(node.right);
                }
                
                
            }
            ls.add(sum);
            sum=0;
            
            
        }
        for(int i=0;i<ls.size();i++){
            
             x=Math.max(ls.get(i),x);

        }
       
        for(int i=0;i<ls.size();i++){
            if(x==ls.get(i)){
                
                    return i+1;

                }

            }

        
        return 0;
        
    }
}