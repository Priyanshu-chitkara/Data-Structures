class Solution {
    public int f(List<Integer> ls,int i,int n,int [] dp){
        if(i>=n-1){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }

        int pick=ls.get(i)+f(ls,i+2,n,dp);
        
        int npick=f(ls,i+1,n,dp);
        int res=Math.max(pick,npick);
        return dp[i]=res;
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int [] dp=new int[n+1];
        List<Integer> ls=new ArrayList<>();
        List<Integer> ls1=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(i>0){
                ls.add(nums[i]);
            }
            if(i<n-1){
                ls1.add(nums[i]);
            }
        }
        Arrays.fill(dp,-1);
       int ans= f(ls,0,n,dp);
       Arrays.fill(dp,-1);
       int rans=f(ls1,0,n,dp);
       int fans=Math.max(ans,rans);
       return fans;
       
    
    }
}