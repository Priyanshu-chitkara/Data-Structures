class Solution {
    public boolean isSafe(int row,int col,int n,char[][] board){
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q') return false;
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }
        for(int i=row,j=col;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q') return false;
        }
        return true;

    }
    public void f(int row,int n,char [][] board,List<List<String>> ls){
        if(row==n){
            List<String> rs = new ArrayList<>();
            for(char [] ch:board){
                rs.add(new String(ch));
            }
            ls.add(new ArrayList<>(rs));
            return;
        }
        
        for(int j=0;j<n;j++){
            if(isSafe(row,j,n,board)){
                board[row][j]='Q';
                f(row+1,n,board,ls);
                board[row][j]='.';
            }


          
        }
        

    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ls=new ArrayList<>();
        char [] [] board=new char[n][n];
        for(char [] ch:board){
            Arrays.fill(ch,'.');
        }
        f(0,n,board,ls);
        return ls;
        
    }
}