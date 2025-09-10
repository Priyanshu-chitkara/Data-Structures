class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int [] ans=new int[n];
        int pindex=0;
        int nindex=1;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                ans[nindex]=nums[i];
                nindex+=2;
            }
            else{
                ans[pindex]=nums[i];
                pindex+=2;
            }
        }
        return ans;
        
    }
}