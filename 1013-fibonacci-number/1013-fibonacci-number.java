class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        //optimised way using space complexity 0(1)
        int prev=1;
        int prev1=0;
        int curr=1;
        for(int i=2;i<=n;i++){
            curr=prev+prev1;
            prev1=prev;
            prev=curr;
        }
        return curr;
        
    }
}