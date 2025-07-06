class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int indez=1;
        
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[indez]=nums[i];
                indez++;
            }


           

                  
            }
            return indez;
          
        
        
    
}
}