class Solution {
    public int printF(int [] dp,int n){
        if(n==1) return 1;
        if(n==2) return 2;
        int prev=2;
        int prev2=1;
        for(int i=3;i<=n;i++){
            int cur=prev+prev2;
            prev2=prev;
            prev=cur;
        }
        return prev;
        
    }
    public int climbStairs(int n) {
        int [] dp=new int [n+1];
       return  printF(dp,n);
        
        
    }
}