class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int l=0;
        int maxfreq=0;
        int r=0;
        int ans=0;
        int [] arr=new int[26];
        while(r<n){
            int wind_size=r-l+1;
            arr[s.charAt(r)-'A']++;
            maxfreq=Math.max(maxfreq,arr[s.charAt(r)-'A']);
            if(wind_size-maxfreq<=k){
                ans=Math.max(ans,wind_size);
            }
            else{
                arr[s.charAt(l)-'A']--;
                l++;
                
            }

            r++;
        }
        return ans;
    }
}