class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int[] freq=new int[26];
        int cnt=0;
        for(int i=0;i<n;i++){
            freq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<=m-n;i++){
              cnt=0;
            int [] freqq=new int[26];
            for(int j=i;j<n+i;j++){
                freqq[s2.charAt(j)-'a']++;
                

            }
            for(int k=0;k<26;k++){
                    if(freq[k]==freqq[k]){
                        cnt++;
                    }
                }
                if(cnt==26){
                    return true;
                }

        }
        return false;

        
    }
}