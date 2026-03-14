class Solution {
    public int subarray(int [] nums,int goal){
        if(goal<0){
            return 0;
        }
        HashMap<Integer,Integer> mp=new HashMap<>();
        int l=0;
        int r=0;
        int n=nums.length;
        int cnt=0;
        while(r<n){
            int curcount=mp.getOrDefault(nums[r],0);
            mp.put(nums[r],curcount+1);
            while(mp.size()>goal){
                if(mp.get(nums[l])==1){
                    mp.remove(nums[l]);
                }
                else{
                    mp.put(nums[l],mp.get(nums[l])-1);
                }
                l++;

            }
            cnt+=r-l+1;
            r++;
        }
        return cnt;

    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        int c1=subarray(nums,k);
        int c2=subarray(nums,k-1);
        return c1-c2;
        
    }
}