class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int ans=Integer.MIN_VALUE;
        int val=0;
        while(l<r){
            if(height[l]<height[r]){
                 val=height[l]*(r-l);
                l++;
            }
            else{
                 val=height[r]*(r-l);
                r--;
            }
            ans=Math.max(ans,val);
        }
        return ans;
        
    }
}