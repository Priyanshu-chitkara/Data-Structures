class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n=nums.length;
        int ind=n-1;
        int d=0;
        int count1=-1;
        while(ind>=0){
            if(nums[ind]==0){
                d++;
               


            }
            else if(nums[ind]==1){
                if(d>=k){
                    count1--;
                    d=0;

                }
                count1++;
                    
                }
                ind--;
        }
        if(count1==0 || count1==-1){
            return true;
        }
        return false;
        
    }
}