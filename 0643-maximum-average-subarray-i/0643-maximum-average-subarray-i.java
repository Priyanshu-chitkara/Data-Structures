class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double slid_wind=0;
        double sum=Integer.MIN_VALUE;
        double avg=0;
        for(int i=0;i<nums.length;i++){
            slid_wind+=nums[i];
            if(i>=k-1){
                sum=Math.max(sum,slid_wind);
                slid_wind-=nums[i-k+1];

            }
            
        }
        avg=sum/k;
        return avg;
       
    }
}