class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int count=0;
        int left = nums[0];
        int right =0;
      for(int i=1;i<n;i++){
        right+=nums[i];
      }
      for(int i=1;i<n-1;i++){
        if((right-left)%2==0){
            count++;
        }
        left+=nums[i];
        right-=nums[i];
      }
      return (right-left)%2==0 ? ++count : count;
        
    }
}