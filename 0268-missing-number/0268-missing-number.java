class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int sums=0;
         for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        while(n>0){
            sums+=n;
            n--;

        }
        
       
        int res=sums-sum;
        return res;
        
    }
}