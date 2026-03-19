class Solution {
    public int subarr(int[] nums,int k){
        int ans=0;
        int cnt=0;
        int l=0;
        int r=0;
        int n=nums.length;
        // HashMap<Integer,Integer> mp=new HashMap<>();
        while(r<n){
            // mp.put(nums[r],mp.getOrDefault(nums[r],0)+1);
           if(nums[r]%2!=0){
            cnt++;

           }
           while(cnt>k){
            if(nums[l]%2!=0){
                cnt--;
            }
            l++;
           }
           ans+=r-l+1;

            
            r++;
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
         return subarr(nums,k)-subarr(nums,k-1);
        
    }
}