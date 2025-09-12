class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }

        Arrays.sort(nums);
        int cur_count=1;
        int max_count=1;
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]==1){
                cur_count++;
            }
            else if(nums[i]-nums[i-1]==0){
                continue;
            }
            else{
                cur_count=1;


            }
            max_count=Math.max(max_count,cur_count);

        }
        return max_count;
        
    }
}