class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int ind=0;
        for(int vals:nums){
            if(vals==val){
                continue;
            }
            nums[ind]=vals;
            ind++;

        }
        return ind;
        
    }
}