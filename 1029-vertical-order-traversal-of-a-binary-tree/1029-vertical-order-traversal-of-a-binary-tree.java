// java

class Tuple{
    TreeNode node;
    int vertical;
    int level;
    Tuple(TreeNode n,int v,int l){
        this.node=n;
        this.vertical=v;
        this.level=l;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        
        TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>> map=new TreeMap<>();
        
        Queue<Tuple> q=new LinkedList<>();
        q.offer(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple t=q.poll();
            TreeNode node=t.node;
            int vertical=t.vertical;
            int level=t.level;

            // If Doesn't contains Vertical
            if(!map.containsKey(vertical)) map.put(vertical,new TreeMap<>());
            // If Doesn't contains level but contains vertical
            if(!map.get(vertical).containsKey(level)) map.get(vertical).put(level,new ArrayList<>());
            // If contains Vertical and level -> add Value
            map.get(vertical).get(level).add(node.val);

            // Traverse Left subtree
            if(node.left!=null) q.offer(new Tuple(node.left,vertical-1,level+1));
            // Traverse right subtree
            if(node.right!=null) q.offer(new Tuple(node.right,vertical+1,level+1));
            
        }

        // Traverse over the map
        for(Map<Integer,ArrayList<Integer>> mpp:map.values()){
            result.add(new ArrayList<>());
            for(ArrayList<Integer> arr:mpp.values()){
                Collections.sort(arr);
                result.get(result.size()-1).addAll(arr);
            }
        }
        return result;
    }
}