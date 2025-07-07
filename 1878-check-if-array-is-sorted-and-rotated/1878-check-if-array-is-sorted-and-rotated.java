class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int bp=0;
        for(int i=1;i<n;i++){
            if(nums[i]>=nums[i-1]){
                continue;
            }
            else{
                bp++;
            }
        }
        if(nums[0]<nums[n-1]){
            bp++;
        }
        return bp<=1;
        
    }
}