class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int [] arr=new int[256];
        Arrays.fill(arr,-1);
        int l=0;
        int r=0;
        int ans=0;
        while(r<n){
            if(arr[s.charAt(r)]!=-1){
                if(arr[s.charAt(r)]>=l){
                    l=arr[s.charAt(r)]+1;
                }

            }
            arr[s.charAt(r)]=r;
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
        
    }
}