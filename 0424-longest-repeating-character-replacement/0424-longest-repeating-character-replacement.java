class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int [] freq=new int[26];
        int maxfreq=0;
        int r=0;
        int l=0;
        int ans=Integer.MIN_VALUE;
        while(r<n){
            
            
            freq[s.charAt(r)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(r)-'A']);
            
            while((r-l+1)-maxfreq>k){
                freq[s.charAt(l)-'A']--;
                

                l++;

            }
            ans=Math.max((r-l+1),ans);
            
            r++;
            
        }
        return ans;
        
    }
}