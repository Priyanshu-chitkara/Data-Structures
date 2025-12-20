class Solution {
    public int f(int [] nums1,int ind,int n){
        if(ind>n-1){
            return 0;
        }
        int pk=nums1[ind]+f(nums1,ind+2,n);
        int npk=f(nums1,ind+1,n);
        return Math.max(pk,npk);

    }
     public int f1(int [] nums2,int ind,int n){
        if(ind>n-1){
            return 0;
        }
        int pk=nums2[ind]+f1(nums2,ind+2,n);
        int npk=f(nums2,ind+1,n);
        return Math.max(pk,npk);

    }
    public int rob(int[] nums) {
        int n=nums.length;
        int [] nums1=new int[n-1];
        int [] nums2=new int[n-1];
        for(int i=0;i<nums1.length;i++){
            nums1[i]=nums[i];
        }
        for(int i=0;i<nums2.length;i++){
            nums2[i]=nums[i+1];
        }
        int res1=f(nums1,0,n-1);
        int res2=f1(nums2,0,n-1);
        int ans=Math.max(res1,res2);
        return ans;

        
    }
}