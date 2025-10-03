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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> ls = new LinkedList<>();
        int counter = 1;
        ls.offer(root);

        while (!ls.isEmpty()) {
            int size = ls.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = ls.poll();

                if (node.left != null) {
                    ls.add(node.left);
                }
                if (node.right != null) {
                    ls.add(node.right);
                }
                if (node.left == null && node.right == null) {
                    return counter;
                }
            }
            counter++;
        }
        return -1;
    }
}