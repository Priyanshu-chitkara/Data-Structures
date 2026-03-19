class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;
        int l=0;
        int r=0;
        int n=nums.length;
        int s=0;
        while(r<n){
            s+=nums[r];

            while(s>=target){
                ans=Math.min(ans,r-l+1);
                s-=nums[l];
                l++;
            }
            
            
            
            
            r++;

        }
        if(ans==Integer.MAX_VALUE){
            return 0;
        }
        return ans;

        
    }
}