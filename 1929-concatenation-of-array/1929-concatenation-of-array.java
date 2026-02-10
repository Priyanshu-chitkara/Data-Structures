class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int len=2*n;
        int [] ans=new int[len];
        int ind=0;
        int indi=0;
        while(ind<len){
            if(indi>=n){
                indi=indi%n;
                
            }
            ans[ind]=nums[indi];
            ind++;
            indi++;
            
        }
        return ans;

    }
}