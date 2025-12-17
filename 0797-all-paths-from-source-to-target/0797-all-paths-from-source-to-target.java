class Solution {
    public void dfs(List<List<Integer>> res,boolean[] arr,List<Integer> ls,int ind,int[][] graph){
         arr[ind]=true;
        ls.add(ind);
        int n=graph.length;
        if(ind==n-1){
            res.add(new ArrayList<>(ls));
        }
       
        for(int neigh:graph[ind]){
            if(!arr[neigh]){
                dfs(res,arr,ls,neigh,graph);
            }

        }
        ls.remove(ls.size()-1);
        arr[ind]=false;

    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        int n=graph.length;
        boolean [] arr=new boolean[n];
        dfs(res,arr,ls,0,graph);
        return res;
        
    }
}