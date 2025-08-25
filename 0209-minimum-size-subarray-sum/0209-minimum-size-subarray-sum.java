class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min_windsize=Integer.MAX_VALUE;
        int currwindsum=0;
        int wind_start=0;
        for(int windend=0;windend<nums.length;windend++){
            currwindsum+=nums[windend];

             while(currwindsum>=target){
                min_windsize=Math.min(min_windsize,windend-wind_start+1);
                currwindsum-=nums[wind_start];
                wind_start++;
             }
        }
        if(min_windsize==Integer.MAX_VALUE){
            return 0;
        }
        else{
            return min_windsize;

        }
        
       
        
    }
}