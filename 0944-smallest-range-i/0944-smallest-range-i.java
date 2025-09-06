class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);


        }
        int l=max-k;
        int r=min+k;
        int ans=l-r;
        if(ans<0){
            return 0;
        }
        return ans;
        
    }
}