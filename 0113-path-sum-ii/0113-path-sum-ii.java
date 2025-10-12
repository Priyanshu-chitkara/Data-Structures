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
    public void ps(TreeNode root,List<List<Integer>> result,ArrayList<Integer> list,int targetSum){
        if(root==null) return;
        list.add(root.val);
        if(root.left==null && root.right==null && root.val==targetSum){
            result.add(new ArrayList<>(list));
        }
        ps(root.left,result,list,targetSum-root.val);
        ps(root.right,result,list,targetSum-root.val);
        list.remove(list.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result=new ArrayList<>();
        ps(root,result,new ArrayList<>(),targetSum);
        return result;
        
    }
}