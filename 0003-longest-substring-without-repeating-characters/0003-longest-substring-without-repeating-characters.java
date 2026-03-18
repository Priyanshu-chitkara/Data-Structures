class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> mp=new HashMap<>();
        int l=0;
        int r=0;
        int ans=0;
        while(r<n){
            while(mp.containsKey(s.charAt(r))){
            
                mp.remove(s.charAt(l));
                l++;


            }
            ans=Math.max(ans,r-l+1);

            mp.put(s.charAt(r),r);
            r++;
        }
        return ans;
        
    }
}