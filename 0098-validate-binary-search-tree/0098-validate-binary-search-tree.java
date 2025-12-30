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
    public void f(TreeNode root,List<Integer> ls){
        if(root==null){
            return;
        }
        f(root.left,ls);
        ls.add(root.val);
        f(root.right,ls);
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        f(root,ls);
        for(int i=0;i<ls.size()-1;i++){
            if(ls.get(i)>=ls.get(i+1)){
                return false;
            }
        }
        return true;
        
    }
}