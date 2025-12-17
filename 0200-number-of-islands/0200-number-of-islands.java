class Solution {
    public void dfs(int i,int j,char[][] grid,boolean[][] vis){
        vis[i][j]=true;
        int n=grid.length;
        int m=grid[0].length;
        int [] delrow={-1,0,1,0};
        int [] delcol={0,1,0,-1};
        for(int k=0;k<4;k++){
            int nrow=i+delrow[k];
            int ncol=j+delcol[k];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1' && !vis[nrow][ncol]){
                dfs(nrow,ncol,grid,vis);

            }
        }



    }
    public int numIslands(char[][] grid) {
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
        boolean [][] vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    dfs(i,j,grid,vis);
                    count++;
                }

            }
           
        }
        return count;

        
    }
}