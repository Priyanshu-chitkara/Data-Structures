class Solution {
    public int cnt(int [] nums,int k){
         int n=nums.length;
        int l=0;
        int r=0;
        int ans=0;
        int cnt=0;
        while(r<n){
            if(nums[r]%2!=0){
                cnt++;
            }
            while(cnt>k){
                if(nums[l]%2!=0){
                    cnt--;
                }
                l++;
            }
            ans+=r-l+1;


            r++;
        }
        return ans;


    }
    public int numberOfSubarrays(int[] nums, int k) {
        return cnt(nums,k)-cnt(nums,k-1);
        
    }
}