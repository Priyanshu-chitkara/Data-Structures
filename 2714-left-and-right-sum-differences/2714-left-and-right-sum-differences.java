class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int left_result[]=new int[n];
        int right_result[]=new int [n];
        int res[]=new int [n];
        int leftsum=0;
        int rightsum=0;
        
        for(int i=0;i<n;i++){
            left_result[i]=leftsum;
            leftsum+=nums[i];
           

        }
         for(int j=n-1;j>=0;j--){
            right_result[j]=rightsum;
            rightsum+=nums[j];
           

        }
        for(int k=0;k<n;k++){
            res[k]=Math.abs(left_result[k]-right_result[k]);
        }
        return res;
        
    }
}