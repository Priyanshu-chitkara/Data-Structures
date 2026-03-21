class Solution {
    public int maxAscendingSum(int[] nums) {
        int pref=0;
        int ans=0;
        int s=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(pref<nums[i]){
                pref=nums[i];

            }
            else{
                pref=nums[i];
                s=0;
            }
            s+=pref;

           
            ans=Math.max(ans,s);
            
        
        
        
    }
    return ans;
}
}