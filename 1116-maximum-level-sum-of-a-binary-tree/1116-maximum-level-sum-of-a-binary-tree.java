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
        // List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        int sum=0;
        int level=1;
        int res=0;
        int max=Integer.MIN_VALUE;
        while(!que.isEmpty()){
            // List<Integer> rs=new ArrayList<>();
            int n=que.size();
            for(int i=0;i<n;i++){
                TreeNode x=que.poll();
                // rs.add(x.val);
                if(x.left!=null){
                    que.add(x.left);
                }
                if(x.right!=null){
                    que.add(x.right);
                }
                sum+=x.val;
                
            }
            if(max<sum){
                max=sum;
                res=level;
            }

            level++;
            sum=0;
            // list.add(rs);


        }
        return res;
        // int sum=0;
        // for(int i=0;i<list.size();i++){
        //     int len=i.size();
        //     for(int j=0;j<len;j++){
        //         sum+=list[i][j];




        //     }
        //     sum=Math.max(sum,list[i][j]);
        // }
        // return sum;
        
    }
}