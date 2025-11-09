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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int count=0;
       Queue<TreeNode> que=new LinkedList<>();
       que.offer(root);
       while(!que.isEmpty()){
        TreeNode nod=que.poll();
        count++;
        if(nod.left!=null){
            que.add(nod.left);
        }
        if(nod.right!=null){
            que.add(nod.right);

        }
       }
       return count;
        
    }
}