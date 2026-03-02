class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int ans=Integer.MIN_VALUE;
        int val=0;
        while(left<right){
            
            int lh=height[left];
            int rh=height[right];
            if(lh<rh){
                val=lh*(right-left);
                left++;
            }
            else{
                 val=rh*(right-left);
                right--;
            }
            ans=Math.max(ans,val);


        }
        return ans;
        
    }
}