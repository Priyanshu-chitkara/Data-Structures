class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int i=0;
        while(i<n && nums[i]<0 && k>0 ){
            nums[i]=-nums[i];
            i++;
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