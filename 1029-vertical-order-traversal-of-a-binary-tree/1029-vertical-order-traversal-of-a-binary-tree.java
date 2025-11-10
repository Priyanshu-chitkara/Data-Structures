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
 class Pair{
    int vertical;
    TreeNode val;
    int line;
    Pair(int v,TreeNode v1,int l){
        this.vertical=v;
        this.val=v1;
        this.line=l;
    }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ls=new ArrayList<>();
        if(root==null){
            return ls;
        }
        TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>> mp=new TreeMap<>();
        Queue<Pair> que=new LinkedList<>();
        que.offer(new Pair(0,root,0));
        while(!que.isEmpty()){
            Pair p=que.poll();
            int vertical=p.vertical;
            TreeNode res=p.val;
            int horz=p.line;
            if(!mp.containsKey(vertical)){
                mp.put(vertical,new TreeMap<>());
            }
           if(!mp.get(vertical).containsKey(horz)){
            mp.get(vertical).put(horz,new ArrayList<>());
           }
           mp.get(vertical).get(horz).add(res.val);
           if(res.left!=null){
            que.offer(new Pair(vertical-1,res.left,horz+1));
           }
            if(res.right!=null){
            que.offer(new Pair(vertical+1,res.right,horz+1));
           }
        }
        for(TreeMap<Integer,ArrayList<Integer>> mpp : mp.values()){
            ls.add(new ArrayList<>());
            for(ArrayList<Integer> list : mpp.values
            ()){
                Collections.sort(list);
                ls.get(ls.size()-1).addAll(list);
            }

        }

        return ls;
        
    }
}