class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double curwindow=0;
        double sum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            curwindow+=nums[i];
            if(i>=k-1){
                sum=Math.max(sum,curwindow);
                curwindow-=nums[i-k+1];
            }
            

        }
        double avg=sum/k;
        return avg;

        
    }
}