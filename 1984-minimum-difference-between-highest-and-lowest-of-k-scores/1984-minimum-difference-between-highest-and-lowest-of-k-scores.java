class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        int x=Integer.MAX_VALUE;
        Arrays.sort(nums);
        if(n==1){
            if(k==1){
                return 0;

            }
            
        }
        for(int i=0;n>i+k-1;i++){

            x=Math.min(x,nums[i+k-1]-nums[i]);
            
        }
        return x;
        
    }
}