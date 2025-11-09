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
    TreeNode node;
    int vertical;
    int line;
    Pair(TreeNode n,int v,int l){
        this.node = n;
        this.vertical = v;
        this.line = l;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ls=new ArrayList<>();
        TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>> map=new TreeMap<>();
        Queue<Pair> que=new LinkedList<>();
        que.offer(new Pair(root,0,0));
        while(!que.isEmpty()){
            Pair p=que.poll();
            TreeNode node=p.node;
            int vertical=p.vertical;
            int line = p.line;
            
            if(!map.containsKey(vertical)){
                map.put(vertical,new TreeMap<>());
            }
            if(!map.get(vertical).containsKey(line)){
                map.get(vertical).put(line,new ArrayList<>());
            }
            map.get(vertical).get(line).add(node.val);

            if(node.left!=null) que.offer(new Pair(node.left,vertical-1,line+1));
            if(node.right!=null) que.offer(new Pair(node.right,vertical+1,line+1));
        }

                // List<List<Integer>> ls=new ArrayList<>();
        
        for(TreeMap<Integer,ArrayList<Integer>> mpp : map.values()){
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