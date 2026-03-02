class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int [] ans=new int[n];
        Arrays.fill(ans,1);
        
       int pref=1;
        for(int i=1;i<n;i++){
            pref=pref*nums[i-1];
            ans[i]=pref;
        }
       int suff=1;
        for(int i=n-2;i>=0;i--){
            suff=suff*nums[i+1];
            ans[i]*=suff;
        }
        
        return ans;
        
    }
}