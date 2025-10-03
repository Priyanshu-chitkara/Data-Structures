class Solution {
    public void reverse(int []nums,int start,int end){
        int l=start;
        int r=end;
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
    public void rotate(int[] nums, int k) {
        
        int n=nums.length;
        k=k%n;
        if(n==1){
            return;
        }
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        
    }
}