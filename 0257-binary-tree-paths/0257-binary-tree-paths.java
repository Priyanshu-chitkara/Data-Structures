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

    public void btp(TreeNode root,String str,List<String> result){
        if(root==null) return;
        str+=root.val;
        if(root.left==null && root.right==null){
            result.add(str);
        }
        btp(root.left,str+"->",result);
        btp(root.right,str+"->",result);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result=new ArrayList<>();
        btp(root,"",result);
        return result;
    }
}