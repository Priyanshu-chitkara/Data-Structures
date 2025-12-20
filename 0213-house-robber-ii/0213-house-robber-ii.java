class Solution {
    public int f(int [] nums1,int ind,int n,int [] dp1){
        if(ind>n-1){
            return 0;
        }
        if(dp1[ind]!=-1){
            return dp1[ind];
        }
        int pk=nums1[ind]+f(nums1,ind+2,n,dp1);
        int npk=f(nums1,ind+1,n,dp1);
        return dp1[ind]=Math.max(pk,npk);

    }
     public int f1(int [] nums2,int ind,int n,int [] dp2){
        if(ind>n-1){
            return 0;
        }
        if(dp2[ind]!=-1){
            return dp2[ind];
        }
        int pk=nums2[ind]+f1(nums2,ind+2,n,dp2);
        int npk=f1(nums2,ind+1,n,dp2);
        return dp2[ind]=Math.max(pk,npk);

    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int [] nums1=new int[n-1];
        int [] nums2=new int[n-1];
        int [] dp1=new int[n];
        int [] dp2=new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        for(int i=0;i<n-1;i++){
            nums1[i]=nums[i];
        }
        for(int i=0;i<n-1;i++){
            nums2[i]=nums[i+1];
        }
        int res1=f(nums1,0,n-1,dp1);
        int res2=f1(nums2,0,n-1,dp2);
        int ans=Math.max(res1,res2);
        return ans;

        
    }
}