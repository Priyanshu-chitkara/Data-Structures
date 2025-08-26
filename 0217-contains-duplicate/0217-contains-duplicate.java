class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                count++;

            }
        }
        if(count>=1){
            return true;
        }else{
            return false;
        }
        
    }
}