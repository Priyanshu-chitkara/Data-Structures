class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
       long sum=0;
       int l=0;
       int maxfreq=0;
       for(int r=0;r<nums.length;r++){
        sum+=nums[r];
        while((long)nums[r]*(r-l+1)-sum>k){
            sum-=nums[l];
            l++;
        }
        maxfreq=Math.max(maxfreq,r-l+1);
       }
       return maxfreq;
    }
}