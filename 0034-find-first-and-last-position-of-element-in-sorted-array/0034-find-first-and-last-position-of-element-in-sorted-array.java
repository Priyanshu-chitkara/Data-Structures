class Solution {
    public int firstPosition(int []nums,int x){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==x){
                index=mid;
                high=mid-1;



                
            }
            else if(nums[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            
            }
           
        }
        return index;


    }
    public int lastPosition(int []nums,int x){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==x){
                index=mid;
                low=mid+1;
            }
            else if(nums[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return index;


    }
    public int[] searchRange(int[] nums, int target) {
        int [] ans=new int[2];
        ans[0]=firstPosition(nums,target);
        ans[1]=lastPosition(nums,target);
        return ans;
        
    }
}