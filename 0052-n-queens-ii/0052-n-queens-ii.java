class Solution {
    public boolean isSafe(int row,int col,char [][] board,int n){
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
    public void f(int row,char[][] board,int [] arr,int n){
        if(row==n){
            arr[0]++;
            return;

        }
        for(int j=0;j<n;j++){
            if(isSafe(row,j,board,n)){
                board[row][j]='Q';
                f(row+1,board,arr,n);
                board[row][j]='.';
            }

        }

    }
    public int totalNQueens(int n) {
        int [] arr=new int[1];
        char [][] board=new char[n][n];
        for(char [] ch:board){
            Arrays.fill(ch,'.');
        }
        f(0,board,arr,n);
        return arr[0];
    }
}