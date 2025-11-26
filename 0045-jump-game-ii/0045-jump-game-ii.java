class Solution {
    public int jump(int[] nums) {
        int jumps=0;
        int farthest=0;
        int cur_end=0;
        for(int i=0;i<nums.length-1;i++){
            farthest=Math.max(farthest,i+nums[i]);
        
        if(i==cur_end){
            jumps++;
            cur_end=farthest;
        }
        
    }
    return jumps;
    }
}