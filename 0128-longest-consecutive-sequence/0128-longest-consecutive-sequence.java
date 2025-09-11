class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int cur_count=1;
        int n=nums.length;
        int max_count=1;
        if(n==0){
            return 0;
        }
        
    
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]-nums[i-1]==1){
                cur_count++;

            }else{
                cur_count=1;
            }
            max_count=Math.max(max_count,cur_count);
        }
        return max_count;
        
    }
}