class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(n==0){
            return 0;
        }
        int max_count=1;
        int cur_count=1;
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]==1){
                cur_count++;
            }
            else if(nums[i]==nums[i-1]){
                continue;
            }
            else{
                cur_count=1;
            }
            max_count=Math.max(cur_count,max_count);

        }
        
        return max_count;
    }
}