class Solution {
    public void reverse(int[] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        if(k==n){
            for(int i=0;i<n;i++){
                System.out.print(nums[i]+",");
            }
        }
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+",");
        }

        
    }
}