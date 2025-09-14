class Solution {
    public int findfirst(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                index=mid;
                high=mid-1;

            }else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return index;
    }
    public int findlast(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                index=mid;
                low=mid+1;

            }else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
           
        }
         return index;
    }
    public int[] searchRange(int[] nums, int target) {
        int [] ans=new int[]{-1,-1};
        ans[0]=findfirst(nums,target);
        ans[1]=findlast(nums,target);
        return ans;
        
    }
}