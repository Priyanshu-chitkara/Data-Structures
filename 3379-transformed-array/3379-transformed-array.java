class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int [] ans=new int[n];
        int left=0;
        int right=0;
        for(int i=0;i<n;i++){
            int steps=nums[i];
            int index=i;
           
            if(steps>0){
                index=(i+steps)%n;
            } else if(steps<0){
                steps=Math.abs(steps);
                index=(i-steps)%n;
                if(index<0){
                    index+=n;
                }

            }
            ans[i]=nums[index];
          

        }
        return ans;
        
        
    }
}