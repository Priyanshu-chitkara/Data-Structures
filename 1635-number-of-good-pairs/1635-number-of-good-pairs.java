class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101]; int sum=0;
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<101;i++){
            if(freq[i]>1){
                int a = freq[i]*(freq[i]-1)/2;
                sum +=a;
            }
        }
        return sum;
    }
}