class Solution {
    public boolean isDetect(int idx,List<Integer> nums,int len,int k){
        for(int i = idx;i<k+idx - 1;i++){
            if(nums.get(i) >= nums.get(i+1)){
                return false;
            }
        }
        for(int i = idx+k;i<idx+k+k - 1;i++){
            if(nums.get(i) >= nums.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        int len = k * 2;
        int length = n - len;
        for(int i = 0;i<=length;i++){
            if(isDetect(i,nums,len,k)){
                return true;
            }
        }
        return false;
    }
}