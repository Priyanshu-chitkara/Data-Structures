class Solution {
    public int ans(int[] nums,int k){
          int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        int l=0;
        int r=0;
        int count=0;

        while(r<n){
            mp.put(nums[r],mp.getOrDefault(nums[r],0)+1);
            while(mp.size()>k){
                mp.put(nums[l],mp.get(nums[l])-1);
                if(mp.get(nums[l])==0){
                    mp.remove(nums[l]);
                }
                l++;
                

            }
            count+=r-l+1;

            r++;
        }
        return count;
        
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
      return ans(nums,k)-ans(nums,k-1);
    }
}