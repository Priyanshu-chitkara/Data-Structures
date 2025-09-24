class Solution {
    public int firstposition(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
          if(nums[mid]==target){
            index=mid;
            high=mid-1;
          }
          else if(nums[mid]>target){
            high=mid-1;
          }
          else{
            low=mid+1;
          }
        }
        return index;
    }
    public int lastposition(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                index=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;


            }
            else{
                high=mid-1;
            }

        }
        return index;
    }
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=firstposition(nums,target);
        arr[1]=lastposition(nums,target);
        return arr;
        
    }
}