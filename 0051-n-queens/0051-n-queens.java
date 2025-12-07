class Solution {
    public boolean isSafe(char[][] board,int row,int col,int n){
        for(int j=0;j<n;j++){
            if(board[j][col]=='Q') return false;
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }
        for(int i=row,j=col;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q') return false;
        }

        return true;


    }
    public void f(int n,char[][] board,int row,List<List<String>> res){
        if(row==n){
             List<String> ls=new ArrayList<>();
            for(char [] ch:board){
               
                ls.add(new String(ch));

            }
            
           
           
            res.add(ls);
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(board,row,j,n)){
                board[row][j]='Q';
                f(n,board,row+1,res);
                board[row][j]='.';

            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new LinkedList<>();
        char [][] board=new char[n][n];
        for(char [] ch:board){
            Arrays.fill(ch,'.');
        }
        f(n,board,0,res);

        return res;
        
    }
}