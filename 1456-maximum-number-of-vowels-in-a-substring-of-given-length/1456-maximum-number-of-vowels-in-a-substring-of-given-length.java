class Solution {
    public boolean isvowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int n=s.length();
        int cnt=0;
        int maxv=0;
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i))){
                cnt++;

            }
            maxv=cnt;
        }
        for(int i=k;i<n;i++){
            if(isvowel(s.charAt(i))){
                cnt++;
            }
            if(isvowel(s.charAt(i-k))){
                cnt--;
            }
            maxv=Math.max(maxv,cnt);

        }
        return maxv;
        
    }
}