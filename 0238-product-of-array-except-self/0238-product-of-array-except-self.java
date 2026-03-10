class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int [] pref=new int[n];
        int [] suf=new int[n];
       pref[0]=1;
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]*nums[i-1];


        }
        suf[n-1]=1;
        for(int j=n-2;j>=0;j--){
            suf[j]=suf[j+1]*nums[j+1];

        }
        for(int k=0;k<n;k++){
            ans[k]=pref[k]*suf[k];
        }
        return ans;

        
    }
}