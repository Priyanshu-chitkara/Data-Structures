class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int ind=0;
        while(ind<n && k>0 && nums[ind]<0){
            nums[ind]=-nums[ind];
            ind++;
            k--;

        }
        Arrays.sort(nums);
        if(k%2!=0){
            nums[0]=-nums[0];

        }
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        return sum;
        
    }
}