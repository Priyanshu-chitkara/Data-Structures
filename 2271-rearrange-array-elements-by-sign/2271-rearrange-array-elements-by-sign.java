class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int [] pos=new int[n/2];
        int [] neg=new int[n/2];
        int pindex=0;
        int nindex=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                neg[nindex]=nums[i];
                nindex++;
            }
            else{
                pos[pindex]=nums[i];
                pindex++;
            }
        }
        for(int i=0;i<n/2;i++){
            nums[2*i]=pos[i];
            nums[(2*i)+1]=neg[i];
        }
        return nums;
        
    }
}