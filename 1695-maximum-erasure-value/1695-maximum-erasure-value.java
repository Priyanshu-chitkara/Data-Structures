class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l=0;
        int r=0;
        int n=nums.length;
        int s=0;
        int ans=Integer.MIN_VALUE;
        HashSet<Integer> set=new HashSet<>();
        while(r<n){
            while(set.contains(nums[r])){
                s-=nums[l];
                set.remove(nums[l]);
                l++;
            }

            set.add(nums[r]);
            s+=nums[r];
            ans=Math.max(ans,s);

            r++;
        }
        return ans;
        
    }
}