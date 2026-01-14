class Solution {
    public int f(String s,String ans,int ind,int ind1,int [][] dp){
        if(ind<0 || ind1<0){
            return 0;
        }
        if(dp[ind][ind1]!=-1){
            return dp[ind][ind1];
        }
        if(s.charAt(ind)==ans.charAt(ind1)){
            return 1+f(s,ans,ind-1,ind1-1,dp);
        }
        return dp[ind][ind1]=Math.max(f(s,ans,ind-1,ind1,dp),f(s,ans,ind,ind1-1,dp));
    }
    public int minInsertions(String s) {
        
        int n=s.length();
        StringBuilder sb=new StringBuilder(s);
        String ans=sb.reverse().toString();
        int len=ans.length();
        int [][] dp=new int[n][len];
        for(int [] arr:dp){
            Arrays.fill(arr,-1);
        }
        int ansi=f(s,ans,n-1,len-1,dp);
        return n-ansi;
        
    }
}