class Solution {
     public int firstpos(int [] nums,int target){
            int n=nums.length;
          
           
            int ans=-1;
              
            int low=0;
            int high=n-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(nums[mid]==target){
                    ans=mid;
                   high=mid-1;
                   
                   }
                


                
                else if(nums[mid]<target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            return ans;
        }
         public int lastpos(int [] nums,int target){
            int n=nums.length;
            int ans=-1;
            int low=0;
            int high=n-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(nums[mid]==target){
                  ans=mid;
                  low=mid+1;
                  
                   
                  



                }
                else if(nums[mid]<target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            return ans;
           
        }
    public int[] searchRange(int[] nums, int target) {
       
       
       
        int [] arr=new int[2];
        arr[0]=firstpos(nums,target);
        arr[1]=lastpos(nums,target);
        return arr;
        
    }
}