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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        Queue<TreeNode> ls=new LinkedList<>();
        if(root==null){
            return result;
        }
        ls.offer(root);

        while(!ls.isEmpty()){
            int size=ls.size();
            List<Integer> list=new ArrayList<>();
            
            
            for(int i=0;i<size;i++){
                TreeNode node=ls.poll();
                list.add(node.val);
                if(node.left!=null){
                    ls.add(node.left);

                }
                if(node.right!=null){
                    ls.add(node.right);
                }
            }
            
            
            result.add(list);
        }
        Collections.reverse(result);
        return result;

        
    }
}