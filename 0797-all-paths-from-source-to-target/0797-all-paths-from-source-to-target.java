class Solution {
    public void dfs(boolean [] arr,int[][] graph,int ind,List<Integer> ls,List<List<Integer>> res){
        int n=graph.length;
         arr[ind]=true;
         ls.add(ind);
        if(ind==n-1){
            res.add(new ArrayList<>(ls));
        }
        for(int neigh:graph[ind]){
            if(!arr[neigh]){
                dfs(arr,graph,neigh,ls,res);
            }
        }
        ls.remove(ls.size()-1);
        arr[ind]=false;
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res=new ArrayList<>();
        int n=graph.length;
        boolean [] arr=new boolean[n];
    
                    List<Integer> ls=new ArrayList<>();

            dfs(arr,graph,0,ls,res);
        
        return res;
        
    }
}