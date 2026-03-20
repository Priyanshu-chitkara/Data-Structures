class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        if(n==1){
            if(nums[0]<0){
                return nums[0];
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int prod=1;
            for(int j=i;j<n;j++){
                prod*=nums[j];
                ans=Math.max(ans,prod);

            }
        }
        return ans;
        
        
    }
}