class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int r=0;
        long ans=0;
        long s=0;
        HashSet<Integer> set=new HashSet<>();
        while(r<n){
            while(set.contains(nums[r])){
                set.remove(nums[l]);
                s-=nums[l];
                l++;

            }
                set.add(nums[r]);
             s+=nums[r];

            
            if(r-l+1==k){
                 ans=Math.max(ans,s);
                 set.remove(nums[l]);
                s-=nums[l];
                
                l++;
            }
           
           
            
        

            r++;
        }
        return ans;

        
    }
}