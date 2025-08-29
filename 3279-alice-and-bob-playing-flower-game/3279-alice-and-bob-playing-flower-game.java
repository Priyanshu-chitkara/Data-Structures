class Solution {
    public long flowerGame(int n, int m) {
        if(n==1 && m==1){
            return 0;
        }
        return 1L*m*n/2;
        
        
    }
}