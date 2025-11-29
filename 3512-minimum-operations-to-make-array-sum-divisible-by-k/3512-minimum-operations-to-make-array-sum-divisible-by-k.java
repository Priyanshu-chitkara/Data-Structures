class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        int op=0;
        for(int l:nums){
            sum+=l;
        }
        if(sum%k==0){
            return 0;
        }
        if(sum<k){

            return sum;
        }
        while(sum>=k && sum%k>=0){
            sum=sum%k;
            op+=sum;



        }
        return op;

        
    }
}