class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
   
        HashSet<Integer> set=new HashSet<>();
       for(int r=0;r<n;r++){
        if(set.contains(nums[r])){
            return true;
        }
        set.add(nums[r]);
        if(set.size()>k){
            set.remove(nums[r-k]);
            
        }

       }
       return false;
    }
}