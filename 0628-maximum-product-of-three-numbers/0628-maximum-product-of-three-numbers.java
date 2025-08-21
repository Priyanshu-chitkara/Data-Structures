class Solution {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        int n=nums.length;
        int maxpro=1;
    
        for(int i=n-3;i<n;i++){
            maxpro*=nums[i];
          
          

        }
        int res=Math.max(maxpro,nums[0]*nums[1]*nums[n-1]);
        

        return res;
        
    }
}