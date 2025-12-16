class Solution {
    public void dfs(List<List<Integer>> rooms,int ind,boolean [] arr){
        arr[ind]=true;
        for(int neigh:rooms.get(ind)){
            if(!arr[neigh]){
                dfs(rooms,neigh,arr);
            }
        }

    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean [] arr=new boolean[n];
        
            
                dfs(rooms,0,arr);

            
            
        
       for(int i=0;i<n;i++){
        if(arr[i]==false){
            return false;
        }
       }
       return true;
        
    }
}