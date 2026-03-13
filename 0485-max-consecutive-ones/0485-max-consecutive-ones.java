class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int ans=0;
       int l=0;
       int r=0;
       while(r<n){
        if(nums[r]==0){
            l=r+1;

        }
        ans=Math.max(ans,r-l+1);
        r++;
       }
       return ans;
        
    }
}