class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int x=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]<x){
                x=nums[i];
            }
        }
        return x;
        
    }
}