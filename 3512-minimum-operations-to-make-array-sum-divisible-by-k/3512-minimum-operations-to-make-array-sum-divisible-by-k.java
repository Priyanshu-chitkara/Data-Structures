class Solution {
    public int minOperations(int[] nums, int k) {
      
        int sum=0;
        
        for(int l:nums){
            sum+=l;
        }
        if(sum%k==0){
            return 0;
        }
        if(sum<k){

            return sum;
        }
       
        return sum%k;

        
    }
}