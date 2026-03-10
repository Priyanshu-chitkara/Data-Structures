class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        Arrays.fill(ans,1);
        // int [] pref=new int[n];
        // int [] suf=new int[n];
       int prod=1;
        for(int i=1;i<n;i++){
            prod=prod*nums[i-1];
            ans[i]=prod;


        }
        int suf=1;
        
        for(int j=n-2;j>=0;j--){
            suf=suf*nums[j+1];
            ans[j]*=suf;

        }
       
        return ans;

        
    }
}