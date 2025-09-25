class Solution {
    public int possible(int[] nums,int divisor){
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=(nums[i]+divisor-1)/divisor; 
        }
        return sum;


    }
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int n=nums.length;
        int low=1;
        int high=nums[n-1];
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int sum=possible(nums,mid);
            if(sum<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return ans;
        

        
    }
}